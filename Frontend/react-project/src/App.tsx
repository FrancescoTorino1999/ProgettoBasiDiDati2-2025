import React, { useState } from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import Navbar from './components/Navbar/Navbar';
import Home from './components/Pages/Home';
import AboutUs from './components/Pages/AboutUs';
import Curriculum from './components/Pages/Curriculum';
import CreateCv from './components/Pages/CreateCv';
import CurriculumDetail from './components/Pages/CurriculumDetail';
import Footer from './components/Footer/Footer';
import { CONSTANTS } from './constants';
import { LanguageContext, LanguageProvider } from './Contexts/LanguageProvider';

function App() {

  const [lang, setLang] = useState(CONSTANTS.lang_it);
  const [mode, setMode] = useState(CONSTANTS.DARK_MODE);

  return (
    <LanguageProvider>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<AboutUs />} />
          <Route path="/curriculum" element={<Curriculum />} />
          <Route path="/curriculum/:id" element={<CurriculumDetail />} />
          <Route path="/createCv" element={<CreateCv />} />
        </Routes>
        <Footer />
      </BrowserRouter>
    </LanguageProvider>
  );
}

export default App;
