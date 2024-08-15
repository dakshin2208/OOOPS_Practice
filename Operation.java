package Teams.day5;

 class Calculator {

     double add(double num1 , double num2){
         return num1+num2;
     }
     double sub(double num1 , double num2){
         return num1-num2;
     }
     double mul(double num1 , double num2){
         return num1*num2;
     }
     double div(double num1 , double num2){
         if(num2 ==0){
             System.out.println("operation not be performed");
         }
         return num1/num2;
     }

     double operation(double num1 , double num2 , char op){
         switch(op){
             case '+':
                 return add(num1 ,num2);

             case '-':
                 return sub(num1,num2);

             case '*':
                 return mul(num1,num2);

             case '/':
                 return div(num1,num2);
             default:
                 System.out.println("invaild operation selected");
                 return Double.NaN;

         }
     }
}
