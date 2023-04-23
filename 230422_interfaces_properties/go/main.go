package main

import "fmt"

func main() {

	bob := NormalUser{
		name: "Bob Ferguson",
		age:  50}

	alice := PremiumUser{
		premiumName:       "Alice Heritage",
		monthlyPayment:    1000,
		specialAvatarName: "The Contender",
		age:               12,
	}

	DescribeUser(alice)
	DescribeUser(bob)

}

func DescribeUser(user User) {
	fmt.Println("====== User Report ==========")
	fmt.Println("Name:", user.GetName())
	fmt.Println("Age:", user.GetAge())
	fmt.Println()

}

type User interface {
	GetName() string
	GetAge() int
}

type NormalUser struct {
	name string
	age  int
}

func (u NormalUser) GetAge() int {
	return u.age
}

func (u NormalUser) GetName() string {
	name := fmt.Sprintf("%s - normal user", u.name)
	return name
}

type PremiumUser struct {
	premiumName       string
	monthlyPayment    int
	specialAvatarName string
	age               int
}

func (u PremiumUser) GetAge() int {
	return u.age
}

func (u PremiumUser) GetName() string {
	name := fmt.Sprintf("%s - %s", u.premiumName, u.specialAvatarName)
	return name
}
