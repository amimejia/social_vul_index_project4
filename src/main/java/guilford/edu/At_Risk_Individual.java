package guilford.edu;

import java.util.ArrayList;
import java.util.Random;

public class At_Risk_Individual {
    //This is the class file for the At_Risk_Individual class
    //This class will be used to create objects that will be used to store information about the at risk individuals

    //Attributes
    private int income;
    private int age;
    private boolean disability;
    private boolean single_parent;
    
    private boolean vehicle;
    private boolean multi_unit;
    private boolean crowded;
    private boolean limited_english;

    //Strings
    private String employment_type;
    private String education_level;
    private String race;

    //Used for Calculations
    private int num_occupants;
    private int english_speakers;
    private int num_bedrooms;

   private double social_vulnerability_index;

    

    //Constructor
    //Write a constructor that creates random variables for each attribute
    public At_Risk_Individual (){

        //First all the int and boolean types
        Random rand = new Random();
        income = rand.nextInt(100000);
        age = rand.nextInt(80 + 18);
        disability = rand.nextBoolean();
        single_parent = rand.nextBoolean();
        vehicle = rand.nextBoolean();
        multi_unit = rand.nextBoolean();

        //Significant number
        num_occupants = rand.nextInt(12);

        //Will need to make a calculation later, making note
        english_speakers = rand.nextInt(5);

        //Going to make a Calculation later, making note
        num_bedrooms = rand.nextInt(5);

        //Now the String types
        int employment_type_int = rand.nextInt(3);
        if (employment_type_int == 2){
            employment_type = "Full Time";
        }
        else if (employment_type_int == 1){
            employment_type = "Part Time";
        }
        else{
            employment_type = "Unemployed";
        }

        int education_level_int = rand.nextInt(4);
        if (education_level_int == 3){
            education_level = "Equal to or More than Masters Degree";
        }
        else if(education_level_int == 2){
            education_level = "Bachelors Degree";
        }
        else if(education_level_int == 1){
            education_level = "High School Diploma";
        }
        else{
            education_level = "Less than High School Diploma";
        }
        
        int race_int = rand.nextInt(7) + 1;
        if (race_int == 6){
            race = "White, Not Hispanic";
        }
        else if(race_int==5){
            race = "Black, Not Hispanic";
        }
        else if(race_int == 4){
            race = "American Indian or Alaska Native";
        }
        else if (race_int == 3){
            race = "Asian or Pacific Islander";
        }
        else if (race_int == 2){
            race = "Hispanic";
        }
        else{
            race = "Other";
        }

        //First Calculation
        //If the number of bedrooms is less than the number of occupants, then the number of bedrooms is not enough, set crowded to true
        if (num_bedrooms < num_occupants){
            crowded = true;
        }
        else{
            crowded = false;
        }

        //Second Calculation
        //if the number of english speakers is less than the number of occupants, then the number of english speakers is not enough, set limited_english to true
        if (english_speakers < num_occupants){
            limited_english = true;
        }
        else{
            limited_english = false;
        }

        //Calculating social vulnerability index
        if (income < 10000){
            social_vulnerability_index += 0.5;
        }
        else if (income < 15000){
            social_vulnerability_index += 0.3;
        }
        else if (income < 20000){
            social_vulnerability_index += 0.2;
        }
        else if (income < 25000){
            social_vulnerability_index += 0.1;
        }
        else if (income < 50000){
            social_vulnerability_index += 0.009;
        }

        if (age < 18){
            social_vulnerability_index += 0.1;
        }
        else if (age < 25){
            social_vulnerability_index += 0.1;
        }
        else if (age < 35){
            social_vulnerability_index += 0.005;
        }
        else if (age < 45){
            social_vulnerability_index += 0.006;
        }
        else if (age < 55){
            social_vulnerability_index += 0.1;
        }

        if (disability){
            social_vulnerability_index += 0.2;
        }

        if (single_parent){
            social_vulnerability_index += 0.2;
        }

        if (vehicle){
            social_vulnerability_index += 0.1;
        }

        if (multi_unit){
            social_vulnerability_index += 0.05;
        }

        if (crowded){
            social_vulnerability_index += 0.05;
        }

        if (limited_english){
            social_vulnerability_index += 0.1;
        }
        
    }

    //Set a Constructor that can take variables needed and makes it a parameter for the class
    public At_Risk_Individual(int income, int age, boolean disability, boolean single_parent, boolean vehicle, boolean multi_unit, boolean crowded, boolean limited_english, String employment_type, String education_level, String race, double social_vulnerability_index){
        this.income = income;
        this.age = age;
        this.disability = disability;
        this.single_parent = single_parent;
        this.vehicle = vehicle;
        this.multi_unit = multi_unit;
        this.crowded = crowded;
        this.limited_english = limited_english;
        this.employment_type = employment_type;
        this.education_level = education_level;
        this.race = race;
        this.social_vulnerability_index = social_vulnerability_index;
        
    }

    //Getters and Setters for all the attributes inside At_Risk_Individual
    public int getIncome(){
        return income;
    }
    public void setIncome(int income){
        this.income = income;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public boolean getDisability(){
        return disability;
    }
    public void setDisability(boolean disability){
        this.disability = disability;
    }
    public boolean getSingle_Parent(){
        return single_parent;
    }
    public void setSingle_Parent(boolean single_parent){
        this.single_parent = single_parent;
    }
    public boolean getVehicle(){
        return vehicle;
    }
    public void setVehicle(boolean vehicle){
        this.vehicle = vehicle;
    }
    public boolean getMulti_Unit(){
        return multi_unit;
    }
    public void setMulti_Unit(boolean multi_unit){
        this.multi_unit = multi_unit;
    }
    public boolean getCrowded(){
        return crowded;
    }
    public void setCrowded(boolean crowded){
        this.crowded = crowded;
    }
    public boolean getLimited_English(){
        return limited_english;
    }
    public void setLimited_English(boolean limited_english){
        this.limited_english = limited_english;
    }
    public String getEmployment_Type(){
        return employment_type;
    }
    public void setEmployment_Type(String employment_type){
        this.employment_type = employment_type;
    }
    public String getEducation_Level(){
        return education_level;
    }
    public void setEducation_Level(String education_level){
        this.education_level = education_level;
    }
    public double getSocial_Vulnerability_Index(){
        return social_vulnerability_index;
    }
    public void setSocial_Vulnerability_Index(double social_vulnerability_index){
        this.social_vulnerability_index = social_vulnerability_index;
    }
//Create a toString Method
@Override
public String toString() {
    return "Income: " + income + "\n" + "Age: " + age + "\n" + "Disability: " + disability + "\n" +"Single Parent: " + single_parent + "\n" + " Vehicle Owner: " + vehicle + "\n" + "Multi_unit: " +  multi_unit + "\n" + "Crowded: " + crowded + "\n" + "Limted English Speakers: " + limited_english + "\n" + "Employment Type: " + employment_type + "\n" + "Education Level: " + education_level + "\n" + "Race: " + race + "\n"+ "SVI: " + social_vulnerability_index + "\n" + "\n";
}

//Social Vulnerbility Index Calculation Method
//This method will take in the attributes of the class and assign a decimal value to each attribute
//Then it will add up all the decimal values and return the total which will be the social vulnerability index
//public double social_vulnerability_index(){
//     double social_vulnerability_index = 0;
//     if (income < 10000){
//         social_vulnerability_index += 0.5;
//     }
//     else if (income < 15000){
//         social_vulnerability_index += 0.4;
//     }
//     else if (income < 20000){
//         social_vulnerability_index += 0.3;
//     }
//     else if (income < 25000){
//         social_vulnerability_index += 0.2;
//     }
//     else if (income < 30000){
//         social_vulnerability_index += 0.1;
//     }
//     else{
//         social_vulnerability_index += 0;
//     }

//     if (age < 18){
//         social_vulnerability_index += 0.5;
//     }
//     else if (age < 25){
//         social_vulnerability_index += 0.4;
//     }
//     else if (age < 35){
//         social_vulnerability_index += 0.3;
//     }
//     else if (age < 45){
//         social_vulnerability_index += 0.2;
//     }
//     else if (age < 55){
//         social_vulnerability_index += 0.1;
//     }
//     else{
//         social_vulnerability_index += 0;
//     }

//     if (disability == true){
//         social_vulnerability_index += 0.5;
//     }
//     else{
//         social_vulnerability_index += 0;
//     }

//     if (single_parent == true){
//         social_vulnerability_index += 0.5;
//     }
//     else{
//         social_vulnerability_index += 0;
//     }

//     if (vehicle == true){
//         social_vulnerability_index += 0.5;
//     }
//     else{
//         social_vulnerability_index += 0;
//     }

//     if (multi_unit == true){
//         social_vulnerability_index += 0.5;
//     }
//     else{
//         social_vulnerability_index += 0;
//     }

//     if (crowded == true){
//         social_vulnerability_index += 0.5;
//     }
//     else{
//         social_vulnerability_index += 0;
//     }

//     if (limited_english == true){
//         social_vulnerability_index += 0.5;
//     }
//     else{
//         social_vulnerability_index += 0;
//     }
//     return social_vulnerability_index;

// }

}
