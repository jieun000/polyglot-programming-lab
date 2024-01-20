#include <stdio.h>
//// 구조체
//struct book {
//	char title[30]; // 30byte
//	char author[30]; // charactor (1byte)=> 30byte
//	int price; // 정수(4byte) 
//};
//
//int main() {
//	int a = 12;
////	struct book b = {"","",0};
////	printf("%d", a); // decimal
////	struct book b = {"ab","",10};
//	struct book b = {"ab","fab",10};
////	b.title = "홍길동"; // 할당 불가 
//	b.title[0] = 'x'; // 할당 가능 
//	printf("%d\n", b.price);
//	printf("%s\t", b.title);
//	printf("%s\t", b.author);
//	
//	// 반복문 
//	int i = 0;
//	for (i=0; i<30; i++) {
//		b.title[i] = 97 + i; // 61 ASCII
//	}
//	printf("%s\t", b.title);
//	return 0;
//}
//

// 문제 
#include <stdlib.h>
struct book {
	char title[30]; // 30byte
	char author[30]; // charactor (1byte)=> 30byte
	int price; // 정수(4byte) 
	int math[10];
	int eng[10];
	int korea[10];
	int total[10];
	float avg[10];
};

int main() {
	int a = rand();
//	printf("a? %d\t", a); // decimal
	struct book b2;
	int i = 0;
	for (i=0; i<3; i++) {
		b2.math[i] = rand();
		b2.eng[i] = rand();
		b2.korea[i] = rand();
		b2.total[0] = b2.math[i] + b2.eng[i] + b2.korea[i];
	}
	b2.avg[0] = b2.total[0] / 3.0;
	printf("Math: %d, English: %d, Korean: %d\nTotal: %d, Avg: %f", b2.math[0], b2.eng[0], b2.korea[0], b2.total[0], b2.avg[0]);
	return 0;
}
