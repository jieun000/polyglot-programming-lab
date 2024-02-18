#include <iostream>
#include <random> // 난수 생성
// 난수 생성
// https://en.cppreference.com/w/cpp/numeric/random/uniform_int_distribution
  
using namespace std;

int main()
{
  std::random_device rd;  // a seed source for the random number engine
  std::mt19937 gen(rd()); // mersenne_twister_engine seeded with rd()
  std::uniform_int_distribution<> distrib(1, 99);

  int number = distrib(gen);
  while(1) {
    int guess;
    cout << "입력: ";
    cin >> guess;
    if(guess == number) {
      cout << "정답!" << endl;
      break;
    } else if(guess > number) {
      cout << "너무 큼!" << endl;
    } else {
      cout << "너무 작아!" << endl;
    }
  }
  return 0;
} 
