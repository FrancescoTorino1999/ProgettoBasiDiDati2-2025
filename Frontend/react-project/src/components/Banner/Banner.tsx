import { Link } from "react-router-dom";
import "./Banner.scss";
function Banner(props: {url: string, label: string}) {

    const {url, label} = props;

    return (
        <>
            <Link className = "banner light-neutral-10" to = {url}>{label}</Link>
        </>
    )

}

export default Banner;