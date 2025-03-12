import React from 'react';
import './HeroBanner.scss'; // Importa il file CSS per la stilizzazione
import { Link } from 'react-router-dom';

function HeroBanner({ title, subtitle, buttonText, buttonLink, backgroundImage }) {
    return (
        <div className="hero-banner" style={{ backgroundImage: `url(${backgroundImage})` }}>
            <div className="hero-content">
                <h1 className="hero-title">{title}</h1>
                <p className="hero-subtitle">{subtitle}</p>
                <Link to={buttonLink} className="hero-button">{buttonText}</Link>
            </div>
        </div>
    );
}

export default HeroBanner;
