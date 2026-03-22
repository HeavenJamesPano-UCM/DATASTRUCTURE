using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WinFormSimpleDAO
{
    internal static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);

            UserDAO dao = new UserDAO(); // shared DAO instance

            while (true) // repeat the cycle
            {
                // Step 1: Register
                using (RegisterForm register = new RegisterForm(dao))
                {
                    if (register.ShowDialog() != DialogResult.OK)
                        break; // user canceled registration → exit app
                }

                // Step 2: Login
                User loggedInUser = null;
                using (LoginForm login = new LoginForm(dao))
                {
                    if (login.ShowDialog() == DialogResult.OK)
                        loggedInUser = login.LoggedInUser;
                }

                if (loggedInUser == null)
                    continue; // login failed → go back to register

                // Step 3: Welcome
                using (WelcomeForm welcome = new WelcomeForm(loggedInUser.username))
                {
                    welcome.ShowDialog(); // modal → blocks until closed
                }
            
            }
        }
    }
}
