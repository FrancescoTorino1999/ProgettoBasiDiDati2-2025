// LanguageContext.js
import React, { createContext, useState } from 'react';
import { CONSTANTS } from '../constants';

const LanguageContext = createContext();

const LanguageProvider = ({ children }) => {
  const [language, setLanguage] = useState(CONSTANTS.lang_it);

  return (
    <LanguageContext.Provider value={{ language, setLanguage }}>
      {children}
    </LanguageContext.Provider>
  );
};

export { LanguageContext, LanguageProvider };
