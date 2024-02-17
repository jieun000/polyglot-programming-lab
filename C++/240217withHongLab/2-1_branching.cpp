#include <iostream>

	// 줄 바꿈 '\n' newline
	// 블럭 내용이 한 줄일 경우에는 {} 생략 가능

using namespace std;  
int main() {
  int number;
  cout << "입력하렴: ";
  cin >> number;

  if (number % 2 == 0) cout << "짝수입니다.\n";
  else cout << "홀수입니다.\n";

  // 조건 연산자(삼항 연산자)
  cout << (number % 2 == 0 ? "짝수야!" : "홀수야!") << endl;

  // switch - case
  switch(number) {
    case 0:
      cout << "switch-case: 정수 0입니다." << endl;
      break; // 주의
    case 1:
      cout << "switch-case: 정수 1입니다." << endl;
      break;
    default:
      cout << "switch-case: 그 외의 숫자입니다." << endl;
      // break; // 생략 가능
  }
  
  return 0;
} 
