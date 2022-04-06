import imp
from account import Account
from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola xxxxxx")
    car = Car('AMQ123',Account('Andrés Herrera','1090222'))
    car2 = Car('EIY594', Account('Sergio Sepúlveda','1010101'))
    print(vars(car2))
    print(vars(car2.driver))
