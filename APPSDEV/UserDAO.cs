using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WinFormSimpleDAO
{
    internal class UserDAO
    {
        private static List<User> users = new List<User>();

        // Default constructor
        public UserDAO() { }

        // Register using username and password
        public bool Register(string username, string password)
        {
            // Check if username already exists
            if (users.Any(u => u.username == username))
            {
                return false; // Username already exists
            }

            // Add new user
            users.Add(new User(username, password));
            return true; // Registration successful
        }
        public bool IsEmpty()
        {
            return users.Count == 0;
        }

        // Login a user
        public User Login(string username, string password)
        {
            return users.FirstOrDefault(u => u.username == username && u.password == password);
        }
    }
}