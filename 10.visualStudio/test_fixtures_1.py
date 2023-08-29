import pytest

# Data fixture 1: A list of numbers
@pytest.fixture
def numbers_list():
  return [1, 2, 3, 4, 5]

# Data fixture 2: A list of strings
@pytest.fixture
def strings_list():
  return ["apple", "banana", "orange"]

# Test function 1: Test the sum of numbers in the list
def test_sum_of_numbers(numbers_list):
  print("no of fixtures :", numbers_list)
  assert len(numbers_list) == 5
  assert sum(numbers_list) == 15

# Test function 2: Test if 'apple' is in the strings list
def test_apple_in_strings_list(strings_list):
  print("no of strings : ", strings_list)
  assert 'apple' in strings_list
  assert 'applee' not in strings_list

# Test function 3: Test the length of the strings list
def test_length_of_strings_list(strings_list):
  assert len(strings_list) == 3
  print(strings_list)