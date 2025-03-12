import axios from "axios";
import { useEffect, useState } from "react";
import CardCurriculum from "../CardCurriculum/CardCurriculum";
import Banner from "../Banner/Banner";
import HeroBanner from "../HeroBanner/HeroBanner";

function Curriculum() {

    const urlRetrieveCurriculum = "http://localhost:8080/getAllCurriculumEn";

    const [cvs, setCvs] = useState([]);

    useEffect(()=>{

        axios.get(urlRetrieveCurriculum).then((response) => {
    
          console.log(response.data);
    
          setCvs(response.data);
    
        })
    
    },[]);

    return (
        <>
            <HeroBanner
                title="CURRICULUM VITAE"
                subtitle="Qui potrai creare CV GRATUITAMENTE"
                buttonText="Scopri di più"
                buttonLink="/about"
                backgroundImage="../imgs/img-hero-cv.jpg"
            />
            <div className= "page">
                <div className='main-container'>

                    <div className='custom-row'>

                        {cvs.map((cv, index) => (
                            <CardCurriculum data = {cv} key = {index}></CardCurriculum>
                        ))}

                    </div>

                </div>

                <Banner label = "Crea il tuo curriculum GRATIS!" url = "/createCv"></Banner>
            </div>
        </>

    )
}

export default Curriculum;