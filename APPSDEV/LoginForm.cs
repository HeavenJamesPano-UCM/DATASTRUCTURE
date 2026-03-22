using System;
using System.Windows.Forms;

namespace WinFormSimpleDAO
{
    public partial class LoginForm : Form
    {
        private UserDAO dao;

        //to store the logged-in user
        public User LoggedInUser { get; private set; }

        // Constructor that takes the DAO instance
        internal LoginForm(UserDAO daoInstance)
        {
            InitializeComponent();
            dao = daoInstance;
            LoggedInUser = null;
            Password.UseSystemPasswordChar = true;
        }

        // Login button click
        private void button1_Click(object sender, EventArgs e)
        {
            string username = Username.Text; // keep your TextBox name
            string password = Password.Text;

            var user = dao.Login(username, password); // use DAO instance
            if (user != null)
            {
                LoggedInUser = user; // store the logged-in user
                this.DialogResult = DialogResult.OK; // signal success
                this.Close(); // close login form

                // ⚠️ Removed direct WelcomeForm creation here
                // Program.cs will handle opening WelcomeForm
            }
            else
            {
                MessageBox.Show("Invalid username or password.");
            }
        }

        //Open register form if you have a register button
        private void buttonRegister_Click(object sender, EventArgs e)
        {
            RegisterForm register = new RegisterForm(dao);
            register.ShowDialog(); // modal registration
        }
    }
}