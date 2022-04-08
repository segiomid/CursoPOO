import imp
from account import Account
from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola xxxxxx")
    car = Car('AMQ123',Account(1,'Andrés Herrera','1090222','sss@g.com','23sds'))
    car2 = Car('EIY594', Account(2,'Sergio Sepúlveda','1010101','sss@g.com','23sds'))
    print(vars(car2))
    print(vars(car2.driver))
