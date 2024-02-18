#include "4-6_phoneBook.h"
#include "4-6_phoneBook.cpp"
#include <iostream>
using namespace std;

int main() {
    PhoneBook my_phonebook;

    // 초기 데이터
    my_phonebook.AddContact("홍정모", "1234-1234");
    my_phonebook.AddContact("둘리", "5678-5678");
    my_phonebook.AddContact("아이언맨", "9123-9123");

    int menu_number;

    while (true) {
        cout << "1: 모두 출력\n";
        cout << "2: 검색\n";
        cout << "3: 추가\n";
        cout << "4: 삭제\n";
        cout << "X: 종료\n";
        cout << "메뉴를 선택해주세요: ";

        cin >> menu_number;
        cin.ignore();

        if (menu_number == 1) my_phonebook.PrintAll(); // 전체 출력
        else if (menu_number == 2) my_phonebook.FindByName(); // 검색
        else if (menu_number == 3) my_phonebook.AddContact(); // 추가
        else if (menu_number == 4) my_phonebook.DeleteByName(); // 삭제
        else {
            cout << "종료합니다." << endl;
            break;
        }
    }

    return 0;
}