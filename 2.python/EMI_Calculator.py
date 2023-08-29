import math

def calculate_num_emis(principal_amount, monthly_emi, interest_rate):
   monthly_interest_rate = interest_rate / 12 / 100
   num_emis: float = math.log(monthly_emi / (monthly_emi - (principal_amount * monthly_interest_rate))) / math.log(1 + monthly_interest_rate)
   return math.ceil(num_emis)

principal_amount = 1000000.00
monthly_emi = 15000.00
interest_rate = 12.0

num_emis = calculate_num_emis(principal_amount, monthly_emi, interest_rate)
print("Number of EMIs to complete the loan:", num_emis)