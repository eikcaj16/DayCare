import csv
import random

StudentNum = 100
TeacherNum = 30

Title_S = ["studentId", "FirstName", "LastName", "Address", "DateOfBirth",
           "parent_name", "email", "registrationDate", "PhoneNum",
           "classroom_id", "group_id", "rating"]
Title_T = ["teacherId", "classroom_id", "group_id",
           "FirstName", "LastName", "DateOfBirth", "Address",
           "parent_name", "PhoneNum",
           "rating"]
Title_I = ["immu_id", "stu_id", "imm_name_dose", "imm_date"]

SidBase = 2000000
TidBase = 3000000
PhoneBase = 781000000
tail_set = []
AddressType = [" Ave, Boston", " Street, Boston", " Road, Boston"]


def load_names(name_file):
    names = []
    f = open(name_file)
    for line in f.readlines():
        info = line.strip().split()
        names.extend(info)

    return names


def generate_student_data(filename):
    student_writer = csv.writer(open(filename, "w", newline=''), dialect="excel")
    student_writer.writerow(Title_S)
    stu_id = SidBase

    for i in range(StudentNum):
        stu_id += random.randint(1, 11)

        name_idx = random.randint(0, len(Names) - 1)
        first_name = Names[name_idx]
        last_name = Names[(name_idx + 1000) % len(Names)]

        address_type = random.randint(0, 2)
        address = str(random.randint(1, 500)) + " " + Names[(name_idx + 1500) % len(Names)] \
                  + AddressType[address_type]

        year = random.randint(2016, 2020)
        month = random.randint(1, 12)
        day = random.randint(1, 28)
        date_of_birth = str(year) + "-" + str(month) + "-" + str(day)

        parent_name = Names[(name_idx + 2000) % len(Names)] + " " + last_name

        email = first_name + "_" + str(random.randint(0, 10000)) + "@outlook.com"

        phone_tail = random.randint(1, 999999)
        while phone_tail in tail_set:
            phone_tail = random.randint(1, 999999)
        tail_set.append(phone_tail)
        phone_num = PhoneBase + phone_tail

        registration_date = str(min(2021, year + random.randint(1, 5))) \
                            + "-9-" + str(random.randint(1, 15))

        info = [stu_id, first_name, last_name, address, date_of_birth,
                parent_name, email, registration_date, phone_num, "", "", ""]

        student_writer.writerow(info)


def generate_teacher_data(filename):
    teacher_writer = csv.writer(open(filename, "w", newline=''), dialect="excel")
    teacher_writer.writerow(Title_T)

    t_id = TidBase

    for i in range(TeacherNum):
        t_id += random.randint(1, 11)

        name_idx = random.randint(0, len(Names) - 1)
        first_name = Names[name_idx]
        last_name = Names[(name_idx + 1000) % len(Names)]

        address_type = random.randint(0, 2)
        address = str(random.randint(1, 500)) + " " + Names[(name_idx + 1500) % len(Names)] \
                  + AddressType[address_type]

        year = random.randint(1970, 1995)
        month = random.randint(1, 12)
        day = random.randint(1, 28)
        date_of_birth = str(year) + "-" + str(month) + "-" + str(day)

        phone_tail = random.randint(1, 999999)
        while phone_tail in tail_set:
            phone_tail = random.randint(1, 999999)
        tail_set.append(phone_tail)
        phone_num = PhoneBase + phone_tail

        parent_name = Names[(name_idx + 2000) % len(Names)]

        review = 0.0

        info = [t_id, "", "", first_name, last_name, date_of_birth,
                address, parent_name, phone_num, review]

        teacher_writer.writerow(info)


if __name__ == '__main__':
    Names = load_names("names.txt")
    generate_student_data("student_data.csv")
    generate_teacher_data("teachers_data.csv")
