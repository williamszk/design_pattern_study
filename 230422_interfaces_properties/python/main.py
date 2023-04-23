from dataclasses import dataclass
from abc import ABC, abstractmethod


def main():
    bob = NormalUser(name="Bob Ferguson", age=50)

    alice = PremiumUser(
        premium_name="Alice Heritage",
        monthly_payment=1000,
        special_avatar_name="The Contender",
        age=12,
    )

    describe_user(alice)
    describe_user(bob)


class User(ABC):
    @abstractmethod
    def get_name(self) -> str:
        pass

    @abstractmethod
    def get_age(self) -> int:
        pass


@dataclass
class PremiumUser(User):
    premium_name: str
    monthly_payment: int
    special_avatar_name: str
    age: int

    def get_name(self) -> str:
        name: str = f"{self.premium_name} - {self.special_avatar_name}"
        return name

    def get_age(self) -> int:
        return self.age


@dataclass
class NormalUser(User):
    name: str
    age: int

    def get_name(self) -> str:
        name = f"{self.name} - normal user"
        return name

    def get_age(self) -> int:
        return self.age


def describe_user(user: User):
    print("==== User Report =========")
    print(f"Name: {user.get_name()}")
    print(f"Age: {user.get_age()}")
    print()


if __name__ == "__main__":
    main()
