#include <iostream>
#include <stdio.h>
#include <string>
#include <vector>

using namespace std;

void equal(int num_people, vector<int> list){
    
}

int main(){
    int t, num_people, temp;
    vector<int> input;
    cin >> t;
    while(t--){
        cin >> num_people;
        for(int i = 0; i<num_people; i++){
            cin >> temp;
            input.push_back(temp);
        }
        equal(num_people, input);
    }


}

