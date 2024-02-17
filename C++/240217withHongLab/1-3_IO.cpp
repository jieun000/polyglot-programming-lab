#include <iostream>
#include <limits>
// <limits>: 숫자형 데이터 타입의 최솟값 및 최댓값 등과 관련된 정보를 제공하는 
// numeric_limits 템플릿 클래스

using namespace std;  
int main() {
//    char user_input[100];
//    cout << "원하는 문장을 입력하세요." << endl;
//    cout << "입력: ";

   // cin: 데이터를 흘려넣어 보내는 스트림
   // 이 데이터를 해석하는 것은 자료형
   // 자료형에 따라 자동 처리하기 때문에 scanf()보다 편리함.
   // cin의 특징: 중간에 빈칸 or 줄바꿈이 있으면 뒤는 안 받음.
   // -> 전체를 다 받고 싶다면 getline(받을 문자배열이름, 최대 받을 크기)
//    cin >> user_input;
//    cin.getline(user_input, sizeof(user_input));
//    cout << "메아리: " << user_input << endl;


    // char user_input[100];
    // int number = -1; // 초기화
    // int number2 = 0;
    // cout << "입력 3번: ";
    // cin.getline(user_input, sizeof(user_input));
    // cin >> number;
    // cin >> number2;
    // cout << user_input << endl; // Hello Hi Once
    // cout << number << endl; // 123
    // cout << number2 << endl; // 456
    // cout << user_input << " " << number << endl; // Hello Hi Once 123



    // char user_input[100];
    // cin >> user_input;
    // cin.ignore(100, '\n'); // 최대 100글자까지 입력받거나 \n을 만나면 뒤는 무시.
    // cout << user_input << endl;

    char user_input[100];
    cin >> user_input;
    // <limits>을 사용,  현재 시스템에서 표현 가능한 가장 큰 스트림 크기를 반환
    cin.ignore(numeric_limits<streamsize>::max(), '\n'); 
    cout << user_input << endl;

    return 0;
} 
