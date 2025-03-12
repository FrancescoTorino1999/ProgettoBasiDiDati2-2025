import { useEffect, useState } from "react";
import Card from "../Card/Card";
import axios from "axios";
import { useParams } from "react-router-dom";

function CurriculumDetail() {

    const { id } = useParams(); // Ottiene il parametro id dall'URL

    const urlRetrieveCurriculum = `http://localhost:8080/getAllCurriculumByIdEn?id=${id}`;


    const [cv, setCv] = useState({});

    useEffect(()=>{

        axios.get(urlRetrieveCurriculum).then((response) => {
    
          console.log(response.data);
    
          setCv(response.data);
    
        })
    
    },[]);

    return (
        <>
            <div className= "page">
                <div className='main-container'>
                    <div className='custom-row'>

                        <Card></Card>

                    </div>
                </div>
            </div>
        </>

    )
}

export default CurriculumDetail;