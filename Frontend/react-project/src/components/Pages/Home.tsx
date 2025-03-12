import { useContext, useEffect, useState } from "react";
import { CONSTANTS } from "../../constants";
import Card from "../Card/Card";
import HeroBanner from "../HeroBanner/HeroBanner";
import { LanguageContext } from "../../Contexts/LanguageProvider";
import TableUsers from "../TableUsers/TableUsers";

function Home() {

    const { language, setLanguage } = useContext(LanguageContext);
    const [data, setData] = useState([]);

    useEffect(() => {
        fetch("http://localhost:8080/findAll")
            .then(response => response.json())
            .then(data => setData(data))
            .catch(error => console.error('Error fetching data:', error));
    }, []); // Il secondo parametro vuoto [] significa che il codice viene eseguito solo una volta, al caricamento del componente


    return (
        <>
            <HeroBanner
                title={language == CONSTANTS.lang_it ? CONSTANTS.IT.HOMEPAGE.HERO_BANNER_TITLE : CONSTANTS.EN.HOMEPAGE.HERO_BANNER_TITLE }
                subtitle={language == CONSTANTS.lang_it ? CONSTANTS.IT.HOMEPAGE.HERO_BANNER_SUBTITLE : CONSTANTS.EN.HOMEPAGE.HERO_BANNER_SUBTITLE }
                buttonText={language == CONSTANTS.lang_it ? CONSTANTS.IT.ALLPAGES.SCOPRI_DI_PIU_LABEL : CONSTANTS.EN.ALLPAGES.SCOPRI_DI_PIU_LABEL }
                buttonLink="/about"
                backgroundImage="../imgs/img-hero-home.jpg"
            />
            <div className= "page">
            
                <div className='main-container'>

                    <div className='custom-row'>

                        <TableUsers users={data}></TableUsers>

                    </div>

                </div>
            </div>
        </>

    )
}

export default Home;