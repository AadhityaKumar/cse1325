import pyodbc

db = pyodbc.connect(Trusted_Connection = 'yes', driver = '{SQL Server}', server = 'LAPTOP-I73C2NHS\SQLEXPRESS', database = 'aadhitya')

mycursor = db.cursor()

with open("publication.sql", 'r') as file:
    line = file.read()
    instructions = line.strip().split(";")

for i in range(len(instructions)-1):
    mycursor.execute(instructions[i])

    if "SELECT" in instructions[i][:10]:
        myresult = mycursor.fetchall()

        for x in myresult:
            print(x)
    else:
        db.commit()

"""

mycursor.execute("SELECT * FROM Patron")

myresult = mycursor.fetchall()

for x in myresult:
    print(x)

"""

db.close()

#Database server: LAPTOP-I73C2NHS\SQLEXPRESS (SQL Server 16.0.1000 - LAPTOP-I73C2NHS\axk88)
#Database: aadhitya
#Username: LAPTOP-I73C2NHS\axk88

#Connection String: Data Source=LAPTOP-I73C2NHS\SQLEXPRESS;Integrated Security=True;Persist Security Info=False;Pooling=False;MultipleActiveResultSets=False;Encrypt=True;TrustServerCertificate=True;Application Name="SQL Server Management Studio";Command Timeout=0
