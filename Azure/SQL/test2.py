import mysql.connector
import sys

#Start MySQL and Apache, then run in cmd with "python Aadhitya_Kumar.py *user* *pass*"

db = mysql.connector.connect(host = "localhost",
                            user = sys.argv[1],
                            passwd = sys.argv[2],
                            database = "cse3330")

mycursor = db.cursor()

mycursor.execute("SELECT * FROM sailors")

myresult = mycursor.fetchall()

for x in myresult:
   print(x)


db.close()

#Database server: LAPTOP-I73C2NHS\SQLEXPRESS (SQL Server 16.0.1000 - LAPTOP-I73C2NHS\axk88)
#Database: aadhitya