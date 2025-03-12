import { useContext, useEffect, useState } from 'react'
import './Navbar.scss'
import { Link, useLocation } from 'react-router-dom'
import axios from 'axios';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faBars, faTimes } from '@fortawesome/free-solid-svg-icons'
import { CONSTANTS } from "../../constants";
import { LanguageContext } from '../../Contexts/LanguageProvider';

function Navbar() {

  const { setLanguage } = useContext(LanguageContext);
  
  const location = useLocation();

  const [paths, setPaths] = useState([{path: "", label: ""}]);
  const [isMenuOpen, setIsMenuOpen] = useState(false);

  

  const toggleMenu = () => {
    setIsMenuOpen(!isMenuOpen);
  }

  function handleLang(event: { target: { value: any; }; }) {
    setLanguage(event.target.value);
  }

  return (
    <header>
      <div className="navbar light-neutral-10">
        <div>
          <Link to="/">
            <img src="../imgs/apple-touch-icon.png" width={30} height={30} alt="Logo"></img>
          </Link>
        </div>

        <div className="hamburger-menu" onClick={toggleMenu}>
          <FontAwesomeIcon icon={isMenuOpen ? faTimes : faBars} size="lg" />
        </div>

        <nav className={`nav-links ${isMenuOpen ? 'open' : ''}`}>
          {paths.map((path, index) => (
            <Link key={index} to={path.path} className={path.path === location.pathname ? 'active fw-600' : 'fw-500'} onClick={() => setIsMenuOpen(false)}>
              {path.label}
            </Link>
          ))}
          <select id="lang" onChange={handleLang}>
            <option value={CONSTANTS.lang_it}>ITALIANO</option>
            <option value={CONSTANTS.lang_en}>ENGLISH</option>
          </select>
          
        </nav>
      </div>
    </header>
  )
}

export default Navbar;
