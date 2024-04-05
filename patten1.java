class sugam {
        public static void main(String[] args) {
            
          // size of the square
          int size = 5;
          // outer loop
          for (int i = 1; i <=size; i++) {
            // inner loop
            for (int j = 1; j <= size; j++) {
              // print only star in first and last row
              if (i ==1 || j ==1||i== 5||j==5||i==j) {
                
                System.out.print("*");
              }
              else if(i == 2 && j== 4) {
                // print star only at first and last position row
                
                  System.out.print("*");
                }
                else if(i==4 && j==2) {
                  System.out.print("*");
                }
                else {
                  System.out.print(" ");
                }
              }
              System.out.println();
            }
            
        }

    }
