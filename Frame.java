
package Convert;


import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author wuhib
 * This is the class that creates the JFrame and also runs the functions
 * for the different converters.
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
    }

    //This function removes the current panel and replaces it with the selected panel
    public void switchPanels(JPanel panel){
        jLayeredPane1.removeAll();
        jLayeredPane1.add(panel);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }
   
    //This function takes the users selection and switches the current converter to the selected converter
    private void converterSelectionActionPerformed(java.awt.event.ActionEvent evt) {
        
        int i = converterSelection.getSelectedIndex();
  
        switch(i){
            case 0:
                switchPanels(Temperature);
                break;
            case 1:
                switchPanels(Length);
                break;
            case 2:
                switchPanels(Currency);
                break;
            case 3 :
                switchPanels(Weight);
                break;
        }
    
        
    }
    
    //This function is for the Temperature converter
    private void convertActionPerformed(java.awt.event.ActionEvent evt) {
        
        DecimalFormat df = new DecimalFormat("#.#####");
        //Get the users temperature selections on each side
        int input1 = tempSelect1.getSelectedIndex();
        int input2 = tempSelect2.getSelectedIndex();
        
        double input = Double.parseDouble(tempInput.getText());
        
        //Celsius conversion formula
        double c = ((input-32)*(5.0/9.0));
        //Farenheit conversion formula
        double f = ((input*(9.0/5.0)) +32);
        
        
        if((input1==0)&& (input2 ==1)){
        tempOutput.setText(df.format(c));
        }
        else if((input1==1)&& (input2 ==0)){
        tempOutput.setText(df.format(f));
        }
        //Kelvin conversion formula
        else if((input1==2)&& (input2 ==0)){
        f = (input - 273.15) * (9.0/5.0) + 32;
        tempOutput.setText(df.format(f));
        }
        else if((input1==2)&& (input2 ==1)){
        c = (input - 273.15);
        tempOutput.setText(df.format(c));
        }
        else if((input1==0)&& (input2 ==2)){
        tempOutput.setText(df.format(c+273.15));
        }
        else if((input1==1)&& (input2 ==2)){
        tempOutput.setText(df.format(input+273.15));
        }
        else{
        tempOutput.setText(df.format(input));
        }
    }

    //This function is for the Length converter
    private void lengthConvertActionPerformed(java.awt.event.ActionEvent evt) {
        
        DecimalFormat df = new DecimalFormat("#.#####");
        int input1 = length1.getSelectedIndex();
        int input2 = length2.getSelectedIndex();
        double userIn = Double.parseDouble(lengthInput.getText());
        double result;
        
        if(input1 == input2){
            lengthOutput.setText(lengthInput.getText());
        }
        
        /*This function uses switch cases to determine which conversion formula to use
         *based on the users selections
         */
        else{
        switch(input1){
            case 0:
                switch (input2){
                    case 1:
                        result = userIn*1000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 2:
                        result = userIn*100000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 3:
                        result = userIn*1000000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 4:
                        result = userIn*1000000000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 5:
                        result = userIn * 1000000000000.0; 
                        lengthOutput.setText(df.format(result));
                        break;
                    case 6:
                        result = userIn/1.609;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 7:
                        result = userIn*1094;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 8:
                        result = userIn*3281;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 9:
                        result = userIn*39370;
                        lengthOutput.setText(df.format(result));
                        break;
                }
                break;
            case 1:
                switch (input2){
                    case 0:
                        result = userIn/1000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 2:
                        result = userIn*100;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 3:
                        result = userIn*1000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 4:
                        result = userIn*1000000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 5:
                        result = userIn * 1000000000; 
                        lengthOutput.setText(df.format(result));
                        break;
                    case 6:
                        result = userIn/1609.0;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 7:
                        result = userIn*1.094;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 8:
                        result = userIn*3.281;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 9:
                        result = userIn*39.37;
                        
                        lengthOutput.setText(df.format(result));
                        break;
                }
                break;
            case 2:
                switch (input2){
                    case 0:
                        result = userIn/100000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 1:
                        result = userIn/100;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 3:
                        result = userIn*10;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 4:
                        result = userIn*10000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 5:
                        result = userIn * 10000000; 
                        lengthOutput.setText(df.format(result));
                        break;
                    case 6:
                        result = userIn/160934.0;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 7:
                        result = userIn/91.44;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 8:
                        result = userIn/30.48;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 9:
                        result = userIn/2.54;
                        lengthOutput.setText(df.format(result));
                        break;
                }
                break;
            case 3:
                switch (input2){
                    case 0:
                        result = userIn/1000000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 1:
                        result = userIn/1000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 2:
                        result = userIn/10;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 4:
                        result = userIn*1000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 5:
                        result = userIn * 1000000; 
                        lengthOutput.setText(df.format(result));
                        break;
                    case 6:
                        result = userIn/1609000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 7:
                        result = userIn/914;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 8:
                        result = userIn/305;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 9:
                        result = userIn/25.4;
                        lengthOutput.setText(df.format(result));
                        break;
                }
                break;
            case 4:
                switch (input2){
                    case 0:
                        result = userIn/1000000000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 1:
                        result = userIn/1000000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 2:
                        result = userIn/10000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 3:
                        result = userIn/1000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 5:
                        result = userIn * 1000; 
                        lengthOutput.setText(df.format(result));
                        break;
                    case 6:
                        result = userIn/1609000000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 7:
                        result = userIn/914400;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 8:
                        result = userIn/304800;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 9:
                        result = userIn/25400;
                        lengthOutput.setText(df.format(result));
                        break;
                }
                break;
            case 5:
                switch (input2){
                    case 0:
                        result = userIn/1000000000000.0;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 1:
                        result = userIn/1000000000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 2:
                        result = userIn/10000000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 3:
                        result = userIn/1000000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 4:
                        result = userIn / 1000; 
                        lengthOutput.setText(df.format(result));
                        break;
                    case 6:
                        result = userIn/1609000000000.0;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 7:
                        result = userIn/914400000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 8:
                        result = userIn/304800000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 9:
                        result = userIn/25400000;
                        lengthOutput.setText(df.format(result));
                        break;
                }
                break;
            case 6:
                switch (input2){
                    case 0:
                        result = userIn*1.609;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 1:
                        result = userIn*1609;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 2:
                        result = userIn*160934;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 3:
                        result = userIn*1609340;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 4:
                        result = userIn*1609340000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 5:
                        result = userIn*1609340000000.0;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 7:
                        result = userIn*1760;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 8:
                        result = userIn*5280;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 9:
                        result = userIn*63360;
                        lengthOutput.setText(df.format(result));
                        break;
                }
                break;
            case 7:
                switch (input2){
                    case 0:
                        result = userIn/1094;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 1:
                        result = userIn/1.094;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 2:
                        result = userIn*91.44;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 3:
                        result = userIn*914;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 4:
                        result = userIn*914400;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 5:
                        result = userIn*914400000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 6:
                        result = userIn/1760;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 8:
                        result = userIn*3;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 9:
                        result = userIn*36;
                        lengthOutput.setText(df.format(result));
                        break;
                }
                break;
            case 8:
                switch (input2){
                    case 0:
                        result = userIn/3281;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 1:
                        result = userIn/3.281;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 2:
                        result = userIn*30.48;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 3:
                        result = userIn*305;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 4:
                        result = userIn*304800;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 5:
                        result = userIn*304800000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 6:
                        result = userIn/5280;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 7:
                        result = userIn/3;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 9:
                        result = userIn*12;
                        lengthOutput.setText(df.format(result));
                        break;
                }
                break;
            case 9:
                switch (input2){
                    case 0:
                        result = userIn/39370;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 1:
                        result = userIn/39.37;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 2:
                        result = userIn*2.54;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 3:
                        result = userIn*25.4;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 4:
                        result = userIn*25400;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 5:
                        result = userIn*25400000;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 6:
                        result = userIn/63360;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 7:
                        result = userIn/36;
                        lengthOutput.setText(df.format(result));
                        break;
                    case 8:
                        result = userIn/12;
                        lengthOutput.setText(df.format(result));
                        break;
                }
                break;

        }
        
        }
    }
    
    /*This function switches the users two selections so that the vice versa
     *conversion can be seen
     */
    private void switch_ActionPerformed(java.awt.event.ActionEvent evt) {
        
        int temp = tempSelect1.getSelectedIndex();
        tempSelect1.setSelectedIndex(tempSelect2.getSelectedIndex());
        tempSelect2.setSelectedIndex(temp);
        convert.doClick();
        
    }

    /*This function switches the users two selections so that the vice versa
     *conversion can be seen
     */
    private void switch_1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        int temp = length1.getSelectedIndex();
        length1.setSelectedIndex(length2.getSelectedIndex());
        length2.setSelectedIndex(temp);
        lengthConvert.doClick();
    }

    //conversion arrays that hold the current exchange rate for each respective currency in aplphabetical order. Each index responds to a different currency
    
    double audConversion[] = new double[]{1,4.024530,0.543138,0.930238,4.908044,33.17,0.632343,5.982630,55.822366,84.672843,15.353497,1.063051,
        6.459467,56.284459,1.019712,10.613893,858.291452,6.403734,0.693580,6.589293,0.770752};
    double brlConversion[] = new double[]{0.248640,1,0.135046,0.231287,1.220335,8.23,0.157226,1.487520,13.879663,21.053031,3.817488,0.264346,
        1.606080,13.994555,0.253541,2.637777,213.405368,1.592223,0.172453,1.638360,0.191640};
    double gbpConversion[] = new double[]{1.841153,7.404903,1,1.712661,9.036462,61.05,1.164169,11.014941,102.777555,155.895645,28.268126,
    1.957458,11.892866,103.628320,1.877445,19.529900,1580.246004,11.790253,1.276993,12.131902,1.419072};
    double cadConversion[] = new double[]{1.075032, 4.322689, 0.58389, 1, 5.276309, 35.62, 0.679747, 6.431507, 60.010686, 91.025976, 16.505464, 
        1.142959, 6.944131, 60.507684, 1.096222, 11.4013, 922.689382, 6.884216, 0.745628, 7.083697, 0.828583};
    double cnyConversion[] = new double[]{0.203449, 0.822709, 0.110746, 0.18984, 1,0.128867, 1.220077, 11.381374, 17.238944, 3.131907, 0.216609, 
    1.313505, 11.512851, 0.20792, 2.167617, 174.784241, 1.305779, 0.141347, 1.347998, 0.157201};
    double birConverter[] = new double[]{0.030,0.12,0.016,0.028,0.15,1,0.019, 0.18,1.66,2.52,0.46,0.032,0.19,1.69,0.030,0.32,25.56,0.19,0.021,0.20,0.023};
    double eurConverter[] = new double[]{1.58029, 6.416234, 0.860579, 1.476327, 7.789798, 53.23, 1,9.491753, 88.722631, 133.888764, 24.370818, 1.679549, 10.169731, 
    89.776402, 1.61568, 16.810636, 1355.887251, 10.139434, 1.098911, 10.376833, 1.22299};
    double hkdConverter[] = new double[]{0.166485, 0.675964, 0.090661, 0.155546, 0.820524, 5.61, 0.105354,1, 9.346454, 14.10688, 2.567002, 0.176945, 1.0716, 9.46127,
    0.170224, 1.771164, 142.828791, 1.068381, 0.115771, 1.093853, 0.128848};
    double inrConverter[]= new double[]{0.017811, 0.072302, 0.009701, 0.016643, 0.087792, 0.6, 0.011273, 0.107004, 1,1.509195, 0.274635, 0.018932, 0.114672, 1.012285, 
    0.018218, 0.189511, 15.278483, 0.114318, 0.012386, 0.117059, 0.013786};
    double jpyConverter[]= new double[]{0.011801, 0.047904, 0.006427, 0.011026, 0.058186, 0.4, 0.00747, 0.070899, 0.662662, 1,0.181978, 0.012542, 0.075985, 0.670717, 
    0.012069, 0.125562, 10.124315, 0.075758, 0.008208, 0.077537, 0.009135};
    double mxnConverter[]= new double[]{0.064865, 0.263343, 0.035333, 0.060604, 0.31982, 2.19, 0.041061, 0.389684, 3.642244, 5.496387, 1,0.068941, 0.41767, 3.686115, 
    0.066335, 0.690132, 55.632157, 0.416425, 0.045122, 0.426165, 0.050207};
    double nzdConverter[]= new double[]{0.940905, 3.821221, 0.512505, 0.879152, 4.639129, 31.7, 0.595604, 5.652897, 52.830698, 79.732027, 14.505631, 1,6.058406, 53.469755,
    0.96225, 10.011207, 807.133998, 6.040574, 0.654558, 6.182015, 0.728304};
    double nokConverter[] = new double []{0.155303, 0.63063, 0.084599, 0.145123, 0.76573, 5.23, 0.098307, 0.93305, 8.718195, 13.159999, 2.394448, 0.165058,1,
    8.826121, 0.15883, 1.652374, 133.212897, 0.997018, 0.10804, 1.020717, 0.120213};
    double rubConverter[] = new double[]{0.017596, 0.071472, 0.009586, 0.016443, 0.086754, 0.59, 0.011139, 0.105718, 0.9879, 1.491065, 0.271346, 0.018703,
    0.113301,1, 0.017996, 0.187222, 15.094895, 0.112965, 0.012242, 0.115649, 0.013621};
    double sgdConverter[] = new double[]{0.977851, 3.970219, 0.532702, 0.913568, 4.820622, 32.95, 0.619011, 5.874475, 54.890773, 82.851678, 15.079692, 
    1.039388, 6.295302, 55.578027, 1,10.403228, 838.800385, 6.277845, 0.680334, 6.425867, 0.756868};
    double zarConverter[] = new double[]{0.093992, 0.381618, 0.051208, 0.087812, 0.463387, 3.17, 0.059505, 0.56466, 5.275647, 7.964463, 1.449264, 0.099892,
    0.605094, 5.34219, 0.096127,1, 80.620294, 0.603317, 0.065396, 0.617714, 0.07275};
    double krwConverter[] = new double[]{0.001166, 0.004736, 6.35E-4, 0.001089, 0.005748, 0.039, 7.38E-4, 0.007004, 0.065438, 0.098794, 0.017979, 0.001239,
    0.007506, 0.066267, 0.001192, 0.012404,1, 0.007484, 8.11E-4, 0.007662, 9.02E-4};
    double sekConverter[] = new double[]{0.155855, 0.633591, 0.084901, 0.145566, 0.768281, 5.25, 0.098645, 0.936178, 8.747427, 13.205688, 2.404758, 0.165626,
    1.003192, 8.857684, 0.159377, 1.658192, 133.673796,1, 0.108415, 1.024098, 0.120615};
    double chfConverter[] = new double[]{1.437653, 5.841088, 0.783143, 1.34262, 7.086784, 48.44, 0.909957, 8.634749, 80.679392, 121.828884, 22.173565, 1.528036,
    9.253049, 81.697518, 1.469993, 15.291822, 1233.033705, 9.224177, 1,9.443391, 1.112494};
    double tryConverter[] = new double[]{0.152158, 0.618406, 0.082897, 0.142113, 0.75014, 5.13, 0.096313, 0.914072, 8.540776, 12.895782, 2.346248, 0.16171, 0.979468,
    8.648321, 0.155613, 1.61877, 130.521997, 0.976263, 0.105852,1, 0.117766};
    double usdConversion[] = new double[]{1.297361,5.225018,0.704677,1.206869,6.367846,43.02,0.820369,7.762094,72.426182,109.856932,19.920203,
    1.377548,8.380733,73.025209,1.323009,13.771698,1113.579796,8.308423,0.899861,8.549181,1};
    
    
    //array that holds all the individual arrays together
    double[][] currencyArray = {audConversion, brlConversion, gbpConversion,cadConversion, cnyConversion, birConverter, eurConverter, hkdConverter, 
        inrConverter,jpyConverter,mxnConverter,nzdConverter, nokConverter,rubConverter,sgdConverter,zarConverter,krwConverter, sekConverter,
        chfConverter, tryConverter, usdConversion};
    
    //This is the function for the Currency converter
    private void currConvertActionPerformed(java.awt.event.ActionEvent evt) {
        
        DecimalFormat df = new DecimalFormat("#.##");
        int currency1 = currSelect1.getSelectedIndex();
        int currency2 = currSelect2.getSelectedIndex();
        
        double userInput = Double.parseDouble(currInput.getText());
        
        //multiply the users number input by the conversion rate of the selected currency 
        double result = userInput * currencyArray[currency1][currency2];
        
        //Display the converted currency
        currOutput.setText(df.format(result));
    }
    
    /*This function switches the users two selections so that the vice versa
     *conversion can be seen
     */
    private void switch_2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        int temp = currSelect1.getSelectedIndex();
        currSelect1.setSelectedIndex(currSelect2.getSelectedIndex());
        currSelect2.setSelectedIndex(temp);
        currConvert.doClick();
    }

    //Any time a selection is changed, the new conversion is automatically calculated
    private void currSelect1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        currConvert.doClick();
    }

    //Any time a selection is changed, the new conversion is automatically calculated
    private void currSelect2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        currConvert.doClick();
    }

    
    //arrays made to hold the multiplication values for each conversion
    double metricTon[] = new double[]{1, 1000,1000000, 1000000000.0,1000000000000.0,0.984207,1.10231,2204.62,35274};
    double kilogram[] = new double[]{.001,1,1000,1000000,1000000000.0,0.000984207,0.00110231,2.20462,35.274};
    double gram[] = new double[]{0.000001,0.001,1,1000,1000000,.00000098421,.0000011023,0.00220462,0.035274};
    double milligram[] = new double[]{0.000000001,0.000001,0.001,1,1000,0.00000000098421,0.0000000011023,0.0000022046,0.000035274};
    double microgram[] = new double[]{0.000000000001,0.000000001,0.000001,0.001,1,0.00000000000098421,0.0000000000011023,0.00000000022046,0.0000000035274};
    double imperialTon[] = new double[]{1.01605,1016.05,1016000,1016000000,1016000000000.0,1,1.12,2240,35840};
    double usTon[] = new double[]{0.907185,907.185,907185,907200000,907200000000.0,0.892857,1,2000,32000};
    double pound[] = new double[]{0.000453592,0.453592,453.592,453592,453600000,0.000446429,0.0005,1,16};
    double ounce[] = new double[]{0.00002835,0.0283495,28.3495,28349.5,28350000,0.000027902,0.00003125,0.0625,1};
    
    double [][] weightArray = {metricTon, kilogram,gram,milligram,microgram,imperialTon,usTon,pound,ounce};
    
    //This is the function for the weight converter
    private void weightConvertActionPerformed(java.awt.event.ActionEvent evt) {
        
        DecimalFormat df = new DecimalFormat("#.##");
        int weight1 = weightSelect1.getSelectedIndex();
        int weight2 = weightSelect2.getSelectedIndex();
        
        double userInput = Double.parseDouble(weightInput.getText());
        
        double result = userInput * weightArray[weight1][weight2];
        
        weightOutput.setText(df.format(result));
    }

   
    //This function switches the users selected weights with one another
    private void switch_3ActionPerformed(java.awt.event.ActionEvent evt) {
        
        int temp = weightSelect1.getSelectedIndex();
        weightSelect1.setSelectedIndex(weightSelect2.getSelectedIndex());
        weightSelect2.setSelectedIndex(temp);
        weightConvert.doClick();
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Currency;
    private javax.swing.JPanel Length;
    private javax.swing.JPanel Temperature;
    private javax.swing.JPanel Weight;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton convert;
    private javax.swing.JComboBox<String> converterSelection;
    private javax.swing.JLabel converterTitle;
    private javax.swing.JLabel converterTitle2;
    private javax.swing.JLabel converterTitle3;
    private javax.swing.JLabel converterTitle5;
    private javax.swing.JButton currConvert;
    private javax.swing.JTextField currInput;
    private javax.swing.JTextField currOutput;
    private javax.swing.JComboBox<String> currSelect1;
    private javax.swing.JComboBox<String> currSelect2;
    private javax.swing.JLabel disclaimer;
    private javax.swing.JLabel disclaimer1;
    private javax.swing.JLabel disclaimer2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> length1;
    private javax.swing.JComboBox<String> length2;
    private javax.swing.JButton lengthConvert;
    private javax.swing.JTextField lengthInput;
    private javax.swing.JTextField lengthOutput;
    private javax.swing.JButton switch_;
    private javax.swing.JButton switch_1;
    private javax.swing.JButton switch_2;
    private javax.swing.JButton switch_3;
    private javax.swing.JTextField tempInput;
    private javax.swing.JTextField tempOutput;
    private javax.swing.JComboBox<String> tempSelect1;
    private javax.swing.JComboBox<String> tempSelect2;
    private javax.swing.JLabel toLabel;
    private javax.swing.JLabel toLabel3;
    private javax.swing.JLabel toLabel4;
    private javax.swing.JButton weightConvert;
    private javax.swing.JTextField weightInput;
    private javax.swing.JTextField weightOutput;
    private javax.swing.JComboBox<String> weightSelect1;
    private javax.swing.JComboBox<String> weightSelect2;
    


//This function initializes all the JFrames, buttons, text fields, etc
    @SuppressWarnings("unchecked")
    
    private void initComponents() {
        
        //initialize each component
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Temperature = new javax.swing.JPanel();
        tempSelect1 = new javax.swing.JComboBox<>();
        convert = new javax.swing.JButton();
        tempInput = new javax.swing.JTextField();
        converterTitle = new javax.swing.JLabel();
        tempOutput = new javax.swing.JTextField();
        toLabel = new javax.swing.JLabel();
        tempSelect2 = new javax.swing.JComboBox<>();
        switch_ = new javax.swing.JButton();
        Length = new javax.swing.JPanel();
        converterTitle2 = new javax.swing.JLabel();
        length1 = new javax.swing.JComboBox<>();
        length2 = new javax.swing.JComboBox<>();
        lengthInput = new javax.swing.JTextField();
        lengthOutput = new javax.swing.JTextField();
        lengthConvert = new javax.swing.JButton();
        disclaimer = new javax.swing.JLabel();
        switch_1 = new javax.swing.JButton();
        Currency = new javax.swing.JPanel();
        converterTitle3 = new javax.swing.JLabel();
        currConvert = new javax.swing.JButton();
        currInput = new javax.swing.JTextField();
        currOutput = new javax.swing.JTextField();
        toLabel3 = new javax.swing.JLabel();
        currSelect2 = new javax.swing.JComboBox<>();
        disclaimer1 = new javax.swing.JLabel();
        currSelect1 = new javax.swing.JComboBox<>();
        switch_2 = new javax.swing.JButton();
        Weight = new javax.swing.JPanel();
        converterTitle5 = new javax.swing.JLabel();
        weightConvert = new javax.swing.JButton();
        weightInput = new javax.swing.JTextField();
        weightOutput = new javax.swing.JTextField();
        toLabel4 = new javax.swing.JLabel();
        weightSelect2 = new javax.swing.JComboBox<>();
        disclaimer2 = new javax.swing.JLabel();
        weightSelect1 = new javax.swing.JComboBox<>();
        switch_3 = new javax.swing.JButton();
        converterSelection = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        tempSelect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenheit", "Celsius", "Kelvin" }));
        tempSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        convert.setText("Convert");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        converterTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        converterTitle.setText("Temperature Converter");

        tempOutput.setEditable(false);
        tempOutput.setBackground(new java.awt.Color(200, 200, 200));

        toLabel.setText("To");

        tempSelect2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenheit", "Celsius", "Kelvin" }));
        tempSelect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        switch_.setText("⇆");
        switch_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switch_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TemperatureLayout = new javax.swing.GroupLayout(Temperature);
        Temperature.setLayout(TemperatureLayout);
        TemperatureLayout.setHorizontalGroup(
            TemperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TemperatureLayout.createSequentialGroup()
                .addGroup(TemperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TemperatureLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(tempInput, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tempSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(switch_)
                        .addGap(32, 32, 32)
                        .addComponent(tempOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tempSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TemperatureLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(converterTitle))
                    .addGroup(TemperatureLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(toLabel))
                    .addGroup(TemperatureLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(151, 153, Short.MAX_VALUE))
        );
        TemperatureLayout.setVerticalGroup(
            TemperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TemperatureLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(converterTitle)
                .addGap(31, 31, 31)
                .addComponent(toLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TemperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(switch_))
                .addGap(18, 18, 18)
                .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Temperature, "card2");

        converterTitle2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        converterTitle2.setText("Length Converter");

        length1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometer", "Meter", "Centimeter", "Milimeter", "Micrometer", "Nanometer", "Mile", "Yard", "Foot", "Inch", " " }));

        length2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometer", "Meter", "Centimeter", "Milimeter", "Micrometer", "Nanometer", "Mile", "Yard", "Foot", "Inch" }));

        lengthOutput.setEditable(false);
        lengthOutput.setBackground(new java.awt.Color(200, 200, 200));

        lengthConvert.setText("Convert");
        lengthConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthConvertActionPerformed(evt);
            }
        });

        disclaimer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        disclaimer.setText("All calculations are approximate, and results are displayed up to the 5th decimal place");

        switch_1.setText("⇆");
        switch_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switch_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LengthLayout = new javax.swing.GroupLayout(Length);
        Length.setLayout(LengthLayout);
        LengthLayout.setHorizontalGroup(
            LengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LengthLayout.createSequentialGroup()
                .addGroup(LengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LengthLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(converterTitle2))
                    .addGroup(LengthLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(disclaimer))
                    .addGroup(LengthLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lengthInput, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(length1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(switch_1)
                        .addGap(31, 31, 31)
                        .addComponent(lengthOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(length2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(LengthLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(lengthConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LengthLayout.setVerticalGroup(
            LengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LengthLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(converterTitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disclaimer)
                .addGap(31, 31, 31)
                .addGroup(LengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(length1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lengthOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(length2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(switch_1))
                .addGap(18, 18, 18)
                .addComponent(lengthConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Length, "card3");

        converterTitle3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        converterTitle3.setText("Currency Converter");

        currConvert.setText("Convert");
        currConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currConvertActionPerformed(evt);
            }
        });

        currOutput.setEditable(false);
        currOutput.setBackground(new java.awt.Color(200, 200, 200));

        toLabel3.setText("To");

        currSelect2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Australian Dollar(AUD)", "Brazilian Real(BRL)", "British Pound(GBP)", "Canadian Dollar(CAD)", "Chinese Yuan Renminbi(CNY)", "Ethiopian Birr(BIR)", "European Euro(EUR)", "Hong Kong Dollar(HKD)", "Indian Rupee(INR)", "Japanese Yen(JPY)", "Mexican Peso(MXN)", "New Zealand Dollar(NZD)", "Norwegian krone(NOK)", "Russian Ruble(RUB)", "Singapore Dollar(SGD)", "South African Rand(ZAR)", "South Korean Won(KRW)", "Swedish Krona(SEK)", "Swiss Franc(CHF)", "Turkish lira(TRY)", "US Dollar(USD)" }));
        currSelect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currSelect2ActionPerformed(evt);
            }
        });

        disclaimer1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        disclaimer1.setText("All calculations are approximate, and results are displayed up to the 2nd decimal place");

        currSelect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Australian Dollar(AUD)", "Brazilian Real(BRL)", "British Pound(GBP)", "Canadian Dollar(CAD)", "Chinese Yuan Renminbi(CNY)", "Ethiopian Birr(BIR)", "European Euro(EUR)", "Hong Kong Dollar(HKD)", "Indian Rupee(INR)", "Japanese Yen(JPY)", "Mexican Peso(MXN)", "New Zealand Dollar(NZD)", "Norwegian krone(NOK)", "Russian Ruble(RUB)", "Singapore Dollar(SGD)", "South African Rand(ZAR)", "South Korean Won(KRW)", "Swedish Krona(SEK)", "Swiss Franc(CHF)", "Turkish lira(TRY)", "US Dollar(USD)" }));
        currSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currSelect1ActionPerformed(evt);
            }
        });

        switch_2.setText("⇆");
        switch_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switch_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CurrencyLayout = new javax.swing.GroupLayout(Currency);
        Currency.setLayout(CurrencyLayout);
        CurrencyLayout.setHorizontalGroup(
            CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrencyLayout.createSequentialGroup()
                .addGroup(CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CurrencyLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(disclaimer1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CurrencyLayout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(toLabel3))
                    .addGroup(CurrencyLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(converterTitle3)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CurrencyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CurrencyLayout.createSequentialGroup()
                        .addComponent(currInput, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(switch_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(currOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CurrencyLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(currConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(currSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        CurrencyLayout.setVerticalGroup(
            CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrencyLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(converterTitle3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disclaimer1)
                .addGap(11, 11, 11)
                .addComponent(toLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(switch_2)
                    .addComponent(currOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(currConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Currency, "card4");

        converterTitle5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        converterTitle5.setText("Weight Converter");

        weightConvert.setText("Convert");
        weightConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightConvertActionPerformed(evt);
            }
        });

        weightOutput.setEditable(false);
        weightOutput.setBackground(new java.awt.Color(200, 200, 200));

        toLabel4.setText("To");

        weightSelect2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metric ton", "Kilogram", "Gram", "Milligram", "Microgram", "Imperial Ton", "US Ton", "Pound", "Ounce" }));
        weightSelect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        disclaimer2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        disclaimer2.setText("All calculations are approximate, and results are displayed up to the 2nd decimal place");

        weightSelect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metric ton", "Kilogram", "Gram", "Milligram", "Microgram", "Imperial Ton", "US Ton", "Pound", "Ounce" }));
        weightSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        switch_3.setText("⇆");
        switch_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switch_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WeightLayout = new javax.swing.GroupLayout(Weight);
        Weight.setLayout(WeightLayout);
        WeightLayout.setHorizontalGroup(
            WeightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WeightLayout.createSequentialGroup()
                .addGroup(WeightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WeightLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(converterTitle5))
                    .addGroup(WeightLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(weightInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(weightSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(WeightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WeightLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(toLabel4))
                            .addGroup(WeightLayout.createSequentialGroup()
                                .addComponent(switch_3)
                                .addGap(30, 30, 30)
                                .addComponent(weightOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(weightSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(WeightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(WeightLayout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(disclaimer2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WeightLayout.createSequentialGroup()
                    .addGap(253, 253, 253)
                    .addComponent(weightConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        WeightLayout.setVerticalGroup(
            WeightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WeightLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(converterTitle5)
                .addGap(50, 50, 50)
                .addComponent(toLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WeightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(switch_3)
                    .addComponent(weightSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(WeightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(WeightLayout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(disclaimer2)
                    .addGap(85, 85, 85)
                    .addComponent(weightConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        jLayeredPane1.add(Weight, "card6");

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 650, 260));

        converterSelection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        converterSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Temperature", "Length", "Currency", "Weight" }));
        converterSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converterSelectionActionPerformed(evt);
            }
        });
        jPanel1.add(converterSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 180, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );

        pack();
    }
}
