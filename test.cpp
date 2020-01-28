#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#define THRESHOLD = 10;
int tot1 = 0, tot2 = 0, tot3 = 0, top1 = -1, top2 = -1, top3 = -1, n;

int main(){
	int dev1[10];
	int dev2[10];
	int dev3[10];
	int value;

	
	for(int i = 0; i < 5; i++){
		int random = rand() % 3;
			printf("random %d\n", random);
	}
	
	
//	printf("\nEnter No.of Jobs : ");
//	scanf("%d", &n);
//	
//	for(int i = 0; i < n; i++){
//    	printf("Enter amount of Job %d  Load : ", (i+1));
//    	scanf("%d", &value)
//
//      switch(rand.nextInt(3)){
//        case 0:
//          tot1 += value;
//          pushLoad(dev1, value);
//          break;
//        case 1:
//          tot2 += value;
//          pushLoad(dev2, value);
//          break;
//        case 2:
//          tot3 += value;
//          pushLoad(dev3, value);
//          break;
//      }
//    }
	
}
//
//    System.out.println("\nBefore Normalize\nDev-1\tDev-2\tDev-3");
//    System.out.println(dev1 + "\t" + dev2 + "\t" + dev3);
//
//    if((tot1 < tot2) && (tot1 < tot3)){
//      System.out.println("\nMinimum total " + dev1);
//      int temp = popLoad(dev1);
//      System.out.println(temp + " " + dev1.length);
//    }
//    else if(tot2 < tot3){
//      System.out.println("\nMinimum total " + dev2);
//    }
//    else{
//      System.out.println("\nMinimum total " + dev3);
//    }
//
//  }



