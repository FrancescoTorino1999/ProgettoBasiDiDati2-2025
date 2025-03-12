import { JSXElementConstructor, ReactElement, ReactNode, ReactPortal, useEffect } from "react";
import "./CardCurriculum.scss"
import { Link } from "react-router-dom";

function CardCurriculum(props: { data: { id: string; name: string | number | boolean | ReactElement<any, string | JSXElementConstructor<any>> | Iterable<ReactNode> | ReactPortal | null | undefined; surname: string | number | boolean | ReactElement<any, string | JSXElementConstructor<any>> | Iterable<ReactNode> | ReactPortal | null | undefined; personalSummary: string | number | boolean | ReactElement<any, string | JSXElementConstructor<any>> | Iterable<ReactNode> | ReactPortal | null | undefined; }; }) {

    const link = "/curriculum/" + props.data.id;

    return (

        <>
            <Link to = {link} className = "card-curriculum light-neutral-10">

                <p className="font-heading-m">{props.data.name} {props.data.surname}</p>

                <p className="font-heading-s">{props.data.personalSummary}</p>

            </Link>
        </>

    )

}

export default CardCurriculum;