using System;
using System.Windows.Forms;

namespace WinFormSimpleDAO
{
    public partial class RegisterForm : Form
    {
        private UserDAO dao; // single DAO instance

        // Default constructor (optional, but if used, creates a new DAO)
        public RegisterForm()
        {
            InitializeComponent();
            dao = new UserDAO();
            
        }

        // Constructor that receives the shared DAO instance
        internal RegisterForm(UserDAO daoInstance)
        {
            InitializeComponent();
            dao = daoInstance; // assign passed DAO
            Password.UseSystemPasswordChar = true;
        }

        private void RegisterForm_Load(object sender, EventArgs e)
        {
            // Nothing to do here
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            // Leave empty if you don't need live validation
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string username = Username.Text;
            string password = Password.Text;

            bool success = dao.Register(username, password);

            if (success)
            {
                MessageBox.Show("Registration Successful!");
                this.DialogResult = DialogResult.OK; // signals Program.cs to continue
                this.Close(); // close form only after success
            }
            else
            {
                MessageBox.Show("Username already exists. Please try another.");
                //  clear fields so user can try again
                Username.Clear();
                Password.Clear();
                Username.Focus(); // put cursor back on username
                                  // Do NOT close the form here
            }
        }
    }
}