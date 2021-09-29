package day0705;
//숙제 1. 5명의 키와 몸무게를 토대로 해서 bmi 결과를 입력한 사람까지만 출력하는 프로그램

import java.util.Scanner;
public class BmiChecker01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        // 상수
        // 1. 키의 최소값
        final double HEIGHT_MIN = 0;
        // 2. 키의 최대값
        final double HEIGHT_MAX = 2.72;
        // 3. 몸무게의 최소값
        final double WEIGHT_MIN = 0;
        // 4. 몸무게의 최대값
        final double WEIGHT_MAX = 635;
        // 5. 최대 사람 숫자
        final int HUMAN_SIZE = 5;
        // 6. 비만도의 기준점이 될 상수

        final double STANDARD_I = 18.5;
        final double STANDARD_II = 23;
        final double STANDARD_III = 25;
		
        //변수 
        // 1. 번호를 저장할 배열
        int[] idArray = new int[HUMAN_SIZE];
		// 2. 이름을 저장할 배열
		String[] nameArray = new String[HUMAN_SIZE];	
		 // 3. 키를 저장할 배열
        double[] heightArray = new double[HUMAN_SIZE];
        // 4. 몸무게를 저장할 배열
        double[] weightArray = new double[HUMAN_SIZE];
        // 5. 입력할 인덱스를 저장할 변수
        int index = 0;	
			
			
        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
            	if (index < HUMAN_SIZE) {
            		System.out.println("번호를 입력해주세요.");
                    System.out.print("> ");
                    idArray[index] = scanner.nextInt();
            		
            		
                    System.out.println("이름을 입력해주세요.");
                    System.out.print("> ");
                    scanner.nextLine();
                    nameArray[index] = scanner.nextLine();
                    
                    double score;
                    
                    System.out.println("키를 입력해주세요.");
                    System.out.print("> ");
                    score = scanner.nextDouble();
                    while (!(score >= HEIGHT_MIN && score <= HEIGHT_MAX)) {
                        System.out.println("잘못입력하셨습니다.");
                        System.out.println("키를 입력해주세요.");
                        System.out.print("> ");
                        score = scanner.nextDouble();
                    }

                    heightArray[index] = score;
                    
                    System.out.println("몸무게를 입력해주세요.");
                    System.out.print("> ");
                    score = scanner.nextDouble();
                    while (!(score >= WEIGHT_MIN && score <= WEIGHT_MAX)) {
                        System.out.println("잘못입력하셨습니다.");
                        System.out.println("몸무게를 입력해주세요.");
                        System.out.print("> ");
                        score = scanner.nextDouble();
                    }

                    weightArray[index] = score;
                    
                    index++;
            		
            	} else {
            		// 더이상 입력할 수 없는 상태
                    System.out.println("이미 5명의 정보를 입력했습니다.");
            		
            	}
            	
            	
            }else if (userChoice == 2) {
            	// 출력 코드 구현
                if (index == 0) {
                    // 아직 한명도 입력이 안되어있는 상태
                    System.out.println("아직 한명도 입력되지 않았습니다.");
                }else {
                	//한명은 입력되어 있는 상태
                	for (int i = 0; i < index; i++)  {
                		double bmi = weightArray[i] / heightArray[i] / heightArray[i];
                		  // if - else if 구조를 통하여
                        // 비만도를 String에 저장
                        String result; // 호출하기전에 초기화를 하던가 if문 같은 경우는 else가 있으면 에러 x

                        if (bmi < STANDARD_I) {
                            result = "저체중";
                        } else if (bmi < STANDARD_II) {
                            result = "정상체중";
                        } else if (bmi < STANDARD_III) {
                            result = "과체중";
                        } else {
                            result = "비만";
                        }
                        System.out.printf("키: %.2fm 몸무게: %.2fkg\n", heightArray[i], weightArray[i]);
                        System.out.printf("BMI: %.3f 비만도: %s\n", bmi, result);
                		
                	}
                	
                }
            	
            } else if (userChoice == 3) {
            	System.out.println("사용해주셔서 감사합니다.");
                break;
            	
            }
            
            
        }
        scanner.close();
			
		}
	}



