package com.curriculum.free.model;

import com.curriculum.free.constants.Constants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = Constants.TABLE_CURRICULUM_VITAE, schema = Constants.SCHEMA_CV)
public class CurriculumVitae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "img", nullable = false)
    @JsonProperty("img")
    private String img;

    @Column(name = "name", nullable = false)
    @JsonProperty("name")
    private String name;

    @Column(name = "surname", nullable = false)
    @JsonProperty("surname")
    private String surname;

    @Column(name = "personal_summary", nullable = false)
    @JsonProperty("personalSummary")
    private String personalSummary;

    @Transient
    @JsonProperty("languagesSpoken")
    private List<String> languagesSpokenListed;

    @Column(name = "languages_spoken", nullable = false)
    private String languagesSpoken;

    @Transient
    @JsonProperty("softSkills")
    private List<String> softSkillsListed;

    @Column(name = "soft_skills", nullable = false)
    private String softSkills;

    @Column(name = "phone", nullable = false)
    @JsonProperty("phone")
    private String phone;

    @Column(name = "email", nullable = false)
    @JsonProperty("email")
    private String email;

    @Transient
    @JsonProperty("urls")
    private List<String> urlsListed;

    @Column(name = "urls", nullable = false)
    private String urls;

    @Column(name = "title_experience_1", nullable = false)
    @JsonProperty("titleExperience1")
    private String titleExperience1;

    @Column(name = "title_experience_2", nullable = false)
    @JsonProperty("titleExperience2")
    private String titleExperience2;

    @Column(name = "title_description_1", nullable = false)
    @JsonProperty("titleDescription1")
    private String titleDescription1;

    @Column(name = "title_description_2", nullable = false)
    @JsonProperty("titleDescription2")
    private String titleDescription2;

    @Column(name = "title", nullable = false)
    @JsonProperty("title")
    private String title;

    @Column(name = "date_from", nullable = false)
    @JsonProperty("dateFrom")
    private Date dateFrom;

    @Column(name = "date_to", nullable = false)
    @JsonProperty("dateTo")
    private Date dateTo;

    @Column(name = "final_grade", nullable = false)
    @JsonProperty("finalGrade")
    private String finalGrade;

    @Column(name = "thesis_title", nullable = false)
    @JsonProperty("thesisTitle")
    private String thesisTitle;

    @Transient
    @JsonProperty("mainCourseAreas")
    private List<String> mainCourseAreasListed;

    @Transient
    @JsonProperty("itSkills")
    private List<String> itSkillsListed;

    @Column(name = "main_course_areas", nullable = false)
    private String mainCourseAreas;

    @Column(name = "it_skills", nullable = false)
    private String itSkills;

    public void setLanguagesSpokenFormatted(List<String> languagesSpoken) {
        this.languagesSpokenListed = languagesSpoken; // Keep the list for internal representation
        if (languagesSpoken != null) {
            this.languagesSpoken = String.join(";", languagesSpoken);
        } else {
            this.languagesSpoken = null;
        }
    }

    public void setSoftSkillsFormatted(List<String> softSkills) {
        this.softSkillsListed = softSkills; // Keep the list for internal representation
        if (softSkillsListed != null) {
            this.softSkills = String.join(";", softSkills);
        } else {
            this.softSkills = null;
        }
    }

    public void setUrlsFormatted(List<String> urls) {
        this.urlsListed = urls; // Keep the list for internal representation
        if (urlsListed != null) {
            this.urls = String.join(";", urls);
        } else {
            this.urls = null;
        }
    }

    public void setItSkillsFormatted(List<String> itSkills) {
        this.itSkillsListed = itSkills; // Keep the list for internal representation
        if (itSkillsListed != null) {
            this.itSkills = String.join(";", itSkills);
        } else {
            this.itSkills = null;
        }
    }

    public void setMainCourseAreasFormatted(List<String> mainCourseAreas) {
        this.mainCourseAreasListed = mainCourseAreas; // Keep the list for internal representation
        if (mainCourseAreasListed != null) {
            this.mainCourseAreas = String.join(";", mainCourseAreas);
        } else {
            this.mainCourseAreas = null;
        }
    }

    @JsonIgnore
    public List<String> getLanguagesSpokenListed() {
        return languagesSpokenListed;
    }

    @JsonIgnore
    public List<String> getSoftSkillsListed() {
        return softSkillsListed;
    }

    @JsonIgnore
    public List<String> getUrlsListed() {
        return urlsListed;
    }

    @JsonIgnore
    public List<String> getItSkillsListed() {
        return itSkillsListed;
    }

    @JsonIgnore
    public List<String> getMainCourseAreasListed() {
        return mainCourseAreasListed;
    }

    public void formatStrings(){

        this.setLanguagesSpokenFormatted(this.getLanguagesSpokenListed());
        this.setSoftSkillsFormatted(this.getSoftSkillsListed());
        this.setUrlsFormatted(this.getUrlsListed());
        this.setItSkillsFormatted(this.getItSkillsListed());
        this.setMainCourseAreasFormatted(this.getMainCourseAreasListed());

    }
}
