package com.exam1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account();
        int choose = 0;

        do {
            System.out.println("1.  Account ");
            System.out.println("2. Display All ");
            System.out.println("3. Find person by id");
            System.out.println("4. Deposit ");
            System.out.println("5. Withdraw ");
            System.out.println("6. Update Account");
            System.out.println("7. Exit");

            System.out.println("Choose menu: ");


            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1: {
                    account.addNewPerson();
                }
                break;
                case 2: {
                    account.displayAll();
                }
                break;

                case 3: {
                    Person account1 =  account.findPersonById();
                    if(  account1 != null) {
                        System.out.println("Found");
                    } else {
                        System.out.println("Not found");
                    }
                }
                break;
                case 4: {
                    account.deposit();
                }
                break;
                case 5: {
                    account.withdrawMoney();
                }
                break;
                case 6: {
                    account.updatePersonById();
                }
                break;
                case 7: {
                    System.out.println("Close application");
                    return;
                }
            }

        } while(true);

    }
    }

