#include <iostream>

using namespace std;
int main() {
    int a = 1;
    int b = 2;
    int c = 3; // 100개 있다 쳐.

    int my_array[3] = {1, 2, 3}; // 초기화할 때는 {} 안에 값 나열

    // 인덱싱(zero-based)
    cout << my_array[0] << " "
        << my_array[1] << " " 
        << my_array[2] << endl;

    my_array[1] = 5;
    cout << my_array[0] << " "
        << my_array[1] << " " 
        << my_array[2] << endl;
    
    // cout << my_array[10000] << endl; // 어이없는 숫자 첨가 시 오류

    // 문자열은 기본적으로 문자의 배열
    char name[17] = "Hello C++ World!"; // 공간이 더 작으면 에러남-> show error
    cout << name << " " << sizeof(name) << endl;
    name[0] = 'A';
    name[1] = 'B';
    name[2] = 'C';
    cout << name << endl; // ABClo C++ World!";
    name[2] = '\0'; // AB( 2자리를 null_character로 바꿈 )
    cout << name << endl; // AB

    return 0;
}