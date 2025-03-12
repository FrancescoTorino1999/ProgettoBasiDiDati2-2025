import { CONSTANTS } from "../../constants";
import Card from "../Card/Card";
import { useState } from "react";

function CreateCv() {

    const [languages, setLanguages] = useState<string[]>([]);
    

    function handleAddLanguage(): void {
        const selectedLanguageElement = document.getElementById("languages-spoken") as HTMLSelectElement;
        if (selectedLanguageElement) {
            const selectedLanguage = selectedLanguageElement.value;
            if (selectedLanguage !== "") {
                setLanguages(prevLanguages => [...prevLanguages, selectedLanguage]);
                selectedLanguageElement.value = "";
            }
        }
    }
    

    return (
        <>
            <div className="page">
                <div className='main-container'>

                    <p className="font-heading-xl">Ciao, qui potrai creare il tuo curriculum online</p>
                    <p className="font-body-xl">Inoltre potrai scaricare la versione pdf del tuo curriculum in tutti i formati che vorrai</p>

                    <div className="form-container">

                        <label className="font-body-xl">Inserisci il nome</label>

                        <input type="text" id="name"></input>

                        <label className="font-body-xl">Inserisci il cognome</label>

                        <input type="text" id="surname"></input>

                        <label className="font-body-xl">Inserisci la tua email</label>

                        <input type="email" id="email"></input>

                        <label className="font-body-xl">Inserisci immagine del profilo</label>

                        <input type="file" id="img"></input>

                        <label className="font-body-xl">Inserisci un breve riassunto personale</label>

                        <textarea id="personal-summary"></textarea>

                        <label className="font-body-xl">Inserisci le lingue parlate: {languages.join(", ")}</label>

                        <select id="languages-spoken">
                            <option defaultChecked selected disabled></option>
                            {Object.values(CONSTANTS.isoLangs).map((lang, index) => (
                                <option value={lang.name} key={index}>{lang.name}</option>
                            ))}
                        </select>
                        <button onClick={handleAddLanguage}>Aggiungi lingua</button>


                        <button>Salva</button>

                    </div>

                </div>
            </div>
        </>

    )
}

export default CreateCv;