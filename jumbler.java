import java.util.Scanner;
class jumbler
{
public static void main (String args[])
    {
        int right=0,wrong=0,skip=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("\n"+"\n"+"\n"+"Hello, Welcome to the world of Jumbler."+"\n"+"I am Shourya Singh and i will be your guide through the game."+"\n"+"Before Starting the game please Enter your name");
        String name=obj.nextLine();
        System.out.println("\n"+"\n"+"\n"+"Nice to meet You"+"  "+name+"\n"+"Let me first tell you about the game, bascially this game consist of 10 rounds each having a jumbled word for you to solve and answer in correct form. Every right answer has +4 points and wrong has -1 points while skipping it will give you 0 marks.Only use Lowercase alphabets to answer.Enter 's' to skip any question.The marks will be displayed at the end of the game and your rank accordingly will be given"+"\n"+"So let the game begin"+"\n"+"\n"+"\n"+"\n"+"Press c to continue to Question 1");
        String choicee=obj.nextLine();
        if (choicee.equals("c"))
           
            System.out.println("Q1) OPTTAO");
        String ans1=obj.nextLine();
        if (ans1.equals("potato"))
            right++;
        else if (ans1.equals("s"))
            skip++;
        else
            wrong++;
            System.out.println("It is a kind of vegetable");
            System.out.println("Enter c to continue");
        String choice1=obj.nextLine();
        if(choice1.equals("c"))
           
            System.out.println("\n"+"\n"+"\n"+"Q2) OBETLT");
        String ans2=obj.nextLine();
        if (ans2.equals("bottle"))
            right++;
        else if (ans2.equals("s"))
            skip++;
        else
            wrong++;
            System.out.println("It is a drinks container");
            System.out.println("Enter c to continue");
        String choice2=obj.nextLine();
        if(choice2.equals("c"))
            
            System.out.println("\n"+"\n"+"\n"+"Q3) TCRODO");
        String ans3=obj.nextLine();
        if (ans3.equals("doctor"))
            right++;
        else if (ans3.equals("s"))
            skip++;
        else
            wrong++;
        System.out.println("Hospital Worker");
        System.out.println("Enter c to continue");
        String choice3=obj.nextLine();
        if(choice3.equals("c"))
            
            System.out.println("\n"+"\n"+"\n"+"Q4) CROTCUALAL");
        String ans4=obj.nextLine();
        if (ans4.equals("calculator"))
            right++;
        else if (ans4.equals("s"))
            skip++;
        else
            wrong++;
        System.out.println("Airthmatic problem solving device");
        System.out.println("Enter c to continue");
        String choice4=obj.nextLine();
        if(choice4.equals("c"))
            
            System.out.println("\n"+"\n"+"\n"+"Q5) RMINOTO");
        String ans5=obj.nextLine();
        if (ans5.equals("monitor"))
            right++;
        else if (ans5.equals("s"))
            skip++;
        else
            wrong++;
        System.out.println("Computer output device");
        System.out.println("Enter c to continue");
        String choice5=obj.nextLine();
        if(choice5.equals("c"))
            
            System.out.println("\n"+"\n"+"\n"+"Q6) LAPENREAO");
        String ans6=obj.nextLine();
        if (ans6.equals("aeroplane"))
            right++;
        else if (ans6.equals("s"))
            skip++;
        else
            wrong++;
        System.out.println("Air transport vehicle");
        System.out.println("Enter c to continue");
        String choice6=obj.nextLine();
        if(choice6.equals("c"))
            
            System.out.println("\n"+"\n"+"\n"+"Q7) GMOAN");
        String ans7=obj.nextLine();
        if (ans7.equals("mango"))
            right++;
        else if (ans7.equals("s"))
            skip++;
        else
            wrong++;
        System.out.println("King of all fruits");
        System.out.println("Enter c to continue");
        String choice7=obj.nextLine();
        if(choice7.equals("c"))
            
            System.out.println("\n"+"\n"+"\n"+"Q8) LSOACMOSR");
        String ans8=obj.nextLine();
        if (ans8.equals("classroom"))
            right++;
        else if (ans8.equals("s"))
            skip++;
        else
            wrong++;
        System.out.println("A place to study");
        System.out.println("Enter c to continue");
        String choice8=obj.nextLine();
        if(choice8.equals("c"))
            
            System.out.println("\n"+"\n"+"\n"+"Q9) ROTPOIN");
        String ans9=obj.nextLine();
        if (ans9.equals("portion"))
            right++;
        else if (ans9.equals("s"))
            skip++;
        else
            wrong++;
        System.out.println("A single helping");
        System.out.println("Enter c to continue");
        String choice9=obj.nextLine();
        if(choice9.equals("c"))
            
            System.out.println("\n"+"\n"+"\n"+"Q10) EPHARCUS");
        String ans10=obj.nextLine();
        if (ans10.equals("purchase"))
            right++;
        else if (ans10.equals("s"))
            skip++;
        else
            wrong++;
        System.out.println("To Buy Something");
        System.out.println("Congratulations!!! You have crossed all the 10 stages now lets see your score");
        System.out.println("Enter s to get your score");
        String choice10=obj.nextLine();
        if(choice10.equals("s"))
        {
        
            int marks=(right*4)-(wrong*1);
            System.out.println("\n"+"\n"+"\n"+"Total Correct Answer="+right);
            System.out.println("Total Wrong Answer="+wrong);
            System.out.println("Total Skips="+skip);
            System.out.println("Your final Score="+marks);
            if(right>=8)
                System.out.println("Your Rank is Maestro");
            if((right>=5) && (right<8))
                System.out.println("Your Rank is Rookie");
            if(right<5)
                System.out.println("Bhai Tu Rehne de...kitni bezati karega rank janke");
        }
    }
}

            
            
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        


        
    
