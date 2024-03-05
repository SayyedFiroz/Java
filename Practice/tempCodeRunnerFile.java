    
        sc.nextLine();//to clear the enter

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Your mail id is " +name+"@sx.com");
        //percentage
        int[] marks=new int[5];
        for(int i=0;i<5;i++){
        System.out.println("Enter the Subject " + i+1);
        marks[i] =sc.nextInt();
        }
        int total =0;
        int percentage;
        for (int i:marks){
            total+=i;
        }
        percentage = total*100/500;

        System.out.println("Your percentage is "+ percentage+"%");