using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement.StartPanel;

namespace WinFormSimpleDAO
{
    public partial class WelcomeForm : Form
    {
        public WelcomeForm(string username)
        {
            InitializeComponent();
            label1.Text = "Welcome! " + username;
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }
    }
}
