module.exports =
{
  brand: "KFC",
  base_url: "https://kfc-web-revamp-009.simplexts.com.au/",
  prod_url: "https://www.kfcpakistan.com/",

  locators: {

    header: {

           menu_icon: "/html/body/div/div[2]/div[1]/nav[2]/div/div[1]/button",
      menu_icon_prod: "/html/body/div/div[2]/div[1]/nav/div/div[1]/button",
      store_locator: "/html/body/div[3]/div[2]/ul/ul[1]/a[1]",
      track_order: "/html/body/div[3]/div[2]/ul/ul[1]/a[2]",
      explore_menu: "/html/body/div[3]/div[2]/ul/ul[1]/a[3]",
      login_button: "//*[@id='root']/div[2]/div[1]/nav[2]/div/div[3]/div[2]/div/a/button",
      login_button_prod:"/html/body/div/div[2]/div[1]/nav/div/div[3]/div[2]/div/a",
      cart_header_link: "/html/body/div/div[2]/div[1]/nav[2]/div/div[3]/a",

      pickup: "//*[@id='root']/div[2]/div[1]/nav[2]/div/div[1]/div[2]/div/div[2]/button",
      delivery: "//*[@id='root']/div[2]/div[1]/nav[2]/div/div[1]/div[2]/div/div[1]/button",
      profile_link: "//*[@id='root']/div[2]/div[1]/nav[2]/div/div[3]/div[2]/div/div/button",
      user_name: "//*[@class='side-menu']",

      logout_button: "/html/body/div[3]/div/div/div[3]/ul/button",
      careers_link: "/html/body/div[3]/div[2]/ul/ul[2]/a[8]"
    },

    account_popup: {

      profile_link: "//*[@id='root']/div[2]/div[1]/nav[2]/div/div[3]/div[2]/div/div/button",
      edit_link: "/html/body/div[3]/div/div/div[3]/div/a",
      order_history: "/html/body/div[3]/div/div/div[3]/ul/ul/a[1]",
      my_address: "/html/body/div[3]/div/div/div[3]/ul/ul/a[2]",
      my_cards: "/html/body/div[3]/div/div/div[3]/ul/ul/a[3]",
      my_favorites: "/html/body/div[3]/div/div/div[3]/ul/ul/a[4]",
      logout_button: "/html/body/div[3]/div/div/div[3]/ul/button"

    },


    popups: {

      level_up_popup: "",
      deal_popup_image: "/html/body/div[3]/div/div/div[2]/div/img",
      deal_popup_close: "/html/body/div[3]/div/div/div[1]/button",
      not_today: "/html/body/div[2]/div/div[3]/div/button[1]",
      //html/body/div[2]/div/div[3]/div/button[1]
      count_me_in: "/html/body/div[4]/div/div[3]/div/button[2]"

    },

    login: {

      deal_popup: "/html/body/div[3]/div/div/div[1]/button",
      not_today: "//*[@id='button-1']",
      count_me_in: "//*[@id='button-2']",
      login_link: "//*[@id='root']/div[2]/div[1]/nav/div/div[3]/div[2]/div/a",
      phone: "//*[@id='outlined-number']",
      login_button: "//*[@id='root']/div[2]/div[2]/div[2]/div[2]/div/div[4]/button",

      two_min_error: "/html/body/div[1]/div[1]/div/div/div[1]/div[2]",
      otp_success: "/html/body/div[1]/div[1]/div/div/div[1]/div[2]",
      otp_error: "/html/body/div[1]/div[1]/div/div/div[1]/div[2]",
      otp_expired: "/html/body/div[1]/div[1]/div/div/div[1]/div[2]",

      google_login: "//*[@id='root']/div[2]/div[2]/div[2]/div[2]/div/button",
      otp_sent: "/html/body/div[1]/div[1]/div/div/div[1]/div[2]",


      otp_value_1: "/html/body/div[3]/div/div/div[3]/div[1]/div/div[1]/input[1]",
      otp_value_2: "/html/body/div[3]/div/div/div[3]/div[1]/div/div[1]/input[2]",
      otp_value_3: "/html/body/div[3]/div/div/div[3]/div[1]/div/div[1]/input[3]",
      otp_value_4: "/html/body/div[3]/div/div/div[3]/div[1]/div/div[1]/input[4]",


    },

    signup: {

      first_name_focus: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div",
      first_name: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div/input",
      last_name_focus: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/div/div",
      last_name: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/div/div/input",
      email_address_focus: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[2]/div/div",
      email_address: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[2]/div/div/input",
      birth_focus: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[3]/div/div",
      date_of_birth: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[3]/div/div/input",
      gender_dropdown: "/html/body/div/div[4]/div[3]/div[5]/div/div/svg",
      male_gender: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[4]/div/label[1]/span[1]/input",
      female_gender: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[4]/div/label[2]/span[1]/input",
      other_gender: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[4]/div/label[3]/span[1]/input",
      submit: "/html/body/div[3]/div/div/div[3]/div[2]/button",
      close_window: "/html/body/div[3]/div/div/div[2]/button"
    },

    edit_profile: {

      profile_link: "//*[@id='root']/div[2]/div[1]/nav[2]/div/div[3]/div[2]/div/div/button",

      edit_profile_menu_link: "//*[@id='root']/div[2]/nav[2]/div/div[1]/div[1]/a",
      edit_link: "/html/body/div[3]/div/div/div[3]/div/a",

      first_name: "//*[@name='first_name']",

      first_name_prod: "/html/body/div/div[4]/div[3]/div[1]/div/div/input",

      first_name_error: "/html/body/div/div[5]/div[2]/div[1]/div/p",

      last_name: "//*[@name='last_name']",

      last_name_prod: "/html/body/div/div[4]/div[3]/div[2]/div/div/input",

      email_address: "//*[@name='email_address']",

      email_address_prod: "/html/body/div/div[4]/div[3]/div[3]/div/div/input",
      
      phone_number: "//*[@name='phone_number']",

      phone_number_prod: "/html/body/div/div[4]/div[3]/div[4]/div/div/input",
      
      gender: "//*[@name='gender']",
      
      date_of_birth: "//*[@name='dob']",

      date_of_birth_prod: "/html/body/div/div[4]/div[3]/div[6]/div/div/input",
      
      save_button: "//*[@id='root']/div[5]/div[2]/div[8]/button",

      save_button_prod:"/html/body/div/div[4]/div[3]/div[7]/button",
      
      first_name_error: "/html/body/div/div[5]/div[2]/div[1]/div/p",
      last_name_error: "/html/body/div/div[5]/div[2]/div[2]/div/p",
      invalid_email_error: "/html/body/div/div[5]/div[2]/div[3]/div/p",
      invalid_dob_error: "/html/body/div/div[5]/div[2]/div[6]/div/p",
      my_details: "//*[@id='root']/div[5]/h2",
           profile_pic: "/html/body/div/div[5]/div[1]/div/label/input",

      profile_pic_prod: "/html/body/div/div[4]/div[2]/div/label/input",

      profile_pic_error: "/html/body/div[1]/div[1]/div/div/div[1]/div[2]",
      
      phone_error: "/html/body/div/div[5]/div[2]/div[4]/div/p",

       first_name_error_prod: "/html/body/div/div[4]/div[3]/div[1]/div/p",

        last_name_error_prod: "/html/body/div/div[4]/div[3]/div[2]/div/p",

        invalid_email_error_prod: "/html/body/div/div[4]/div[3]/div[3]/div/p",

        phone_error_prod: "/html/body/div/div[4]/div[3]/div[4]/div/p",

    },

    logout_link: {

      profile_link: "//*[@id='root']/div[2]/div[1]/nav[2]/div/div[3]/div[2]/div/div/button",
      logout_button: "/html/body/div[3]/div/div/div[3]/ul/button"
    },

    deliveryChannels: {

      pickup: "//*[@id='root']/div[2]/div[1]/nav[2]/div/div[1]/div[2]/div/div[2]/button",
      delivery: "//*[@id='root']/div[2]/div[1]/nav[2]/div/div[1]/div[2]/div/div[1]/button"
    },

    menu_page: {

      cart_link: "//*[@id:'cart']/div/button",
      login_link_menu: "/html/body/div[3]/div[2]/div[1]/a",
      day_link: "/html/body/div[3]/div[2]/div[2]/button[1]",
      night_link: "/html/body/div[3]/div[2]/div[2]/button[2]",
      store_locator: "/html/body/div[3]/div[2]/ul/ul[1]/a[1]",
      track_order: "/html/body/div[3]/div[2]/ul/ul[1]/a[2]",
      explore_menu: "/html/body/div[3]/div[2]/ul/ul[1]/a[3]",

      first_item_name: "/html/body/div/div[2]/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div/div[1]/h5",
      second_item_name:"/html/body/div/div[2]/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[1]/h5",
      first_item_fire_icon:"",
      first_item_green_icon:"",
      first_item_share_icon:"",


      first_item_price: "/html/body/div/div[2]/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div/h4",
      first_item_add_to_bucket: "/html/body/div/div[2]/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div/div[2]/div/button[1]",

      first_item_popup: "/html/body/div/div[2]/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/a",

      first_dropdown: "/html/body/div[3]/div/div/div[3]/div[1]/div[1]/div/div/div[1]/h2/button",
      second_dropdown: "/html/body/div[3]/div/div/div[3]/div[1]/div[1]/div/div/div[2]/h2/button",
      third_dropdown: "",
      addons_price: "/html/body/div[3]/div/div/div[3]/div[1]/div[1]/div/div/div[2]/div/div/div[1]/div/div/h6/text()[3]",
      addons_option: "/html/body/div[3]/div/div/div[3]/div[1]/div[1]/div/div/div[2]/div/div/div[1]/div/button",
      popup_price: "/html/body/div[3]/div/div/div[3]/div[2]/div/a/span[1]",
      popup_add_to_bucket: "/html/body/div[3]/div/div/div[3]/div[2]/div/a",


      add_to_favorities: "//*[@id='EverydayValue']/div/div[1]/div/div/div/div[1]/span/div/button",

      favorites_added_popup: "/html/body/div/div[1]/div/div/div[1]/div[2]",

    //  delivery_link: "/html/body/div[3]/div/div/div[3]/div/div[1]/button",

      first_location: "/html/body/div[5]/div/div/div[3]/div/div/div[1]/div/div[1]/label",
      second_location: "/html/body/div[5]/div/div/div[3]/div/div/div[1]/div/div[2]/label",
      home_radio_button: "",
      add_address: "/html/body/div[5]/div/div/div[3]/div/div/div[2]/button",
      start_your_order: "/html/body/div[5]/div/div/div[3]/button",
      enable_current_location: "//*[@id='3']/div[1]/div[2]",
      store_closed_popup_message: "//*[@id='5']/div[1]/div[2]",
      success_popup_message: "",

      pickup_link: "/html/body/div[3]/div/div/div[3]/div/div[2]/button",
      store_input: "/html/body/div[5]/div/div/div[3]/div/div/input",
      select_shop_location: "/html/body/div[3]/div/div/div[3]/div/div/div/div[3]",
      get_direction_button: "/html/body/div[5]/div/div/div[3]/div/div/div/div[1]/div/button",
      store_closed_popup_message_2: "/html/body/div[1]/div[1]/div/div/div[1]/div[2]",
      close_channel_popup: "/html/body/div[5]/div/div/div[2]/button",

      enter_address: "//*[@id='simplex-maps-search-input']",
      confirm_location: "/html/body/div[5]/div/div/div[3]/div/div/div/div/div[2]/div[3]/button",
      save_address: "/html/body/div[5]/div/div/div[3]/div/div/div/div/div[2]/div[4]/label/span[1]/input",
    //  start_order: "/html/body/div[5]/div/div/div[3]/button",
      close_location: "/html/body/div[5]/div/div/div[2]/button",
      pickup_input: "//*[@id='exampleInputEmail1']",
      start_order_2: "/html/body/div[5]/div/div/div[3]/button",
      view_bucket: "/html/body/div/div[2]/div[3]/div/div/div/div[2]/div/a/div",
      checkout: ""
    },


    channel_popup: {

      delivery_link: "/html/body/div[3]/div/div/div[3]/div/div[1]/button",

       first_location: "/html/body/div[5]/div/div/div[3]/div/div/div[1]/div/div[1]/label/span[1]/input",
                     
      second_location: "/html/body/div[5]/div/div/div[3]/div/div/div[1]/div/div[2]/label/span[1]/input",
                      
       third_location: "/html/body/div[5]/div/div/div[3]/div/div/div[1]/div/div[3]/label/span[1]/input",
                  
      fourth_location: "/html/body/div[5]/div/div/div[3]/div/div/div[1]/div/div[4]/label/span[1]/input",

      add_address: "/html/body/div[5]/div/div/div[3]/div/div/div[2]/button",

      address_search: "//*[@id='simplex-maps-search-input']",

      //  address_search:"/html/body/div[5]/div/div/div[3]/div/div/div/div/div[1]/fieldset/div/section/div/section[1]/section/div/div/div[1]/input",

      first_suggestion: "//*[@id='sm-search-result-0']",
      second_suggestion: "//*[@id='sm-search-result-1']",

      confirm_location: "/html/body/div[5]/div/div/div[3]/div/div/div/div/div[2]/div[3]/button",

      address_1: "/html/body/div[5]/div/div/div[3]/div/div/div/div/div[2]/div[3]/div/div/input",
      address_2: "/html/body/div[5]/div/div/div[3]/div/div/div/div/div[2]/div[4]/div/div/input",
      address_3: "/html/body/div[5]/div/div/div[3]/div/div/div/div/div[2]/div[5]/div/div/input",
      other_radio: "/html/body/div[5]/div/div/div[3]/div/div/div[2]/div/div[2]/div[6]/div/label[3]/span[1]/input",
      
      save_address: "/html/body/div[5]/div/div/div[3]/div/div/div[2]/div/div[2]/div[6]/label/span[1]/input",

      start_order: "/html/body/div[5]/div/div/div[3]/button",

      enable_current_location: "//*[@id='3']/div[1]/div[2]",
      store_closed_popup_message: "//*[@id='5']/div[1]/div[2]",

      pickup_link: "/html/body/div[3]/div/div/div[3]/div/div[2]/button",
      store_input: "/html/body/div[5]/div/div/div[3]/div/div/input",
      first_store: "/html/body/div[5]/div/div/div[3]/div/div/div/div[1]",
      second_store:"/html/body/div[5]/div/div/div[3]/div/div/div/div[2]",
      get_direction_button: "/html/body/div[5]/div/div/div[3]/div/div/div/div[1]/div/button",
      store_closed_popup_message_2: "/html/body/div[1]/div[1]/div/div/div[1]/div[2]",
      close_channel_popup: "/html/body/div[5]/div/div/div[2]/button",
      delivery_popup_error: "/html/body/div[1]/div[1]/div/div/div[1]/div[2]"
    },


    address_page: {



      delete_address: ["//*[@id='root']/div[4]/div/div[1]/div/div[2]/span[1]",

        "//*[@id='root']/div[4]/div/div[2]/div/div[2]/span[1]",
        "//*[@id='root']/div[4]/div/div[3]/div/div[2]/span[1]",
        "//*[@id='root']/div[4]/div/div[4]/div/div[2]/span[1]",
        "//*[@id='root']/div[4]/div/div[5]/div/div[2]/span[1]",
        "//*[@id='root']/div[4]/div/div[6]/div/div[2]/span[1]",
        "//*[@id='root']/div[4]/div/div[7]/div/div[2]/span[1]",
        "//*[@id='root']/div[4]/div/div[8]/div/div[2]/span[1]",
      ],




      edit_address: ["//*[@id='root']/div[4]/div/div[1]/div/div[2]/span[2]",
                     "//*[@id='root']/div[4]/div/div[2]/div/div[2]/span[2]",
                     "//*[@id='root']/div[4]/div/div[3]/div/div[2]/span[2]",
                     "//*[@id='root']/div[4]/div/div[4]/div/div[2]/span[2]",
                     "//*[@id='root']/div[4]/div/div[5]/div/div[2]/span[2]",
                     "//*[@id='root']/div[4]/div/div[6]/div/div[2]/span[2]",
                     "//*[@id='root']/div[4]/div/div[7]/div/div[2]/span[2]",
                     "//*[@id='root']/div[4]/div/div[8]/div/div[2]/span[2]",



      ],

      make_default: ["//*[@id='root']/div[4]/div/div[1]/div/div[2]/div/span",
        "//*[@id='root']/div[4]/div/div[2]/div/div[2]/div/span/span[1]/input",
        "//*[@id='root']/div[4]/div/div[3]/div/div[2]/div/span/span[1]/input",
        "//*[@id='root']/div[4]/div/div[4]/div/div[2]/div/span/span[1]/input",
        "//*[@id='root']/div[4]/div/div[5]/div/div[2]/div/span/span[1]/input",
        "//*[@id='root']/div[4]/div/div[6]/div/div[2]/div/span/span[1]/input",
        "//*[@id='root']/div[4]/div/div[7]/div/div[2]/div/span/span[1]/input",
        "//*[@id='root']/div[4]/div/div[8]/div/div[2]/div/span/span[1]/input",


      ],

      address_search: "/html/body/div/div[4]/div/div/div/div[1]/fieldset/div/section/div/section[1]/section/div/div/div[1]/input",
                       //*[@id="simplex-maps-search-input"]
      first_suggestion: "//*[@id='sm-search-result-0']",
      second_suggestion: "//*[@id='sm-search-result-1']",
      address_title: "//*[@id='root']/div[4]/div/div/div/div[2]/div[2]/h5",
      address_edit_1: "/html/body/div/div[4]/div/div/div/div[2]/div[4]/div/div/input",
      address_edit_2: "/html/body/div/div[4]/div/div/div/div[2]/div[5]/div/div/input",
      address_edit_3: "/html/body/div/div[4]/div/div/div/div[2]/div[6]/div/div/input",
      home_edit: "/html/body/div/div[4]/div/div/div/div[2]/div[7]/div/label[1]/span[1]/input",
      office_edit: "/html/body/div/div[4]/div/div/div/div[2]/div[7]/div/label[2]/span[1]/input",
      other_edit: "/html/body/div/div[4]/div/div/div/div[2]/div[7]/div/label[3]/span[1]/input",
      update_address: "/html/body/div/div[4]/div/button",


      add_address: "//*[@id='root']/div[4]/div/button",
      address_1: "/html/body/div/div[4]/div/div/div/div[2]/div[3]/div/div/input",
      address_2: "/html/body/div/div[4]/div/div/div/div[2]/div[4]/div/div/input",
      address_3: "/html/body/div/div[4]/div/div/div/div[2]/div[5]/div/div/input",
      home_label: "//*[@id='root']/div[4]/div/div/div/div[2]/div[6]/div/label[1]/span[2]",
      home: "/html/body/div/div[4]/div/div/div/div[2]/div[6]/div/label[1]/span[1]/input",
      office_label: "//*[@id='root']/div[4]/div/div/div/div[2]/div[6]/div/label[2]/span[2]",
      office: "/html/body/div/div[4]/div/div/div/div[2]/div[6]/div/label[2]/span[1]/input",
      other_label: "//*[@id='root']/div[4]/div/div/div/div[2]/div[6]/div/label[3]/span[2]",
      other: "/html/body/div/div[4]/div/div/div/div[2]/div[6]/div/label[3]/span[1]/input",
      save_address: "//*[@id='root']/div[4]/div/button",

        add_popup: "/html/body/div/div[1]/div/div/div[1]/div[2]",
       edit_popup: "/html/body/div/div[1]/div/div/div[1]/div[2]",
     delete_popup: "/html/body/div/div[1]/div/div/div[1]/div[2]",
    default_popup: "/html/body/div/div[1]/div/div/div[1]/div[2]"

    },


    order_history: {

      reorder: "//*[@id='root']/div[4]/div[2]/div[1]/div/div/a/button",

      reorder_popup: "/html/body/div/div[1]/div/div/div[1]/div[2]",

      order_no: "//*[@id='root']/div[4]/div[2]/div[1]/div/div/div/h5[1]",
      //*[@id="root"]/div[4]/div[2]/div[2]/div/div/div/h5[1]
      //*[@id="root"]/div[4]/div[2]/div[3]/div/div/div/h5[1]
      //*[@id="root"]/div[4]/div[2]/div[4]/div/div/div/h5[1]
      //*[@id="root"]/div[4]/div[2]/div[5]/div/div/div/h5[1] 
      //*[@id="root"]/div[4]/div[2]/div[6]/div/div/div/h5[1]
      //*[@id="root"]/div[4]/div[2]/div[7]/div/div/div/h5[1]
      //*[@id="root"]/div[4]/div[2]/div[8]/div/div/div/h5[1]


      order_no_value: "//*[@id='root']/div[4]/div[2]/div[1]/div/div/div/h5[1]/text()[2]",

      //*[@id="root"]/div[4]/div[2]/div[2]/div/div/div/h5[1]/text()[2]

      //*[@id="root"]/div[4]/div[2]/div[3]/div/div/div/h5[1]/text()[2]

      date: "//*[@id='root']/div[4]/div[2]/div[1]/div/div/div/p[1]",

      price: "/html/body/div/div[4]/div[2]/div[1]/div/div/div/h5[2]",

      view_info: "//*[@id='root']/div[4]/div[2]/div[1]/div/div/div/div/button[1]",

      order_no: "/html/body/div[3]/div/div/div[3]/div/div/div[1]/div/div[2]/h5",

      order_channel: "/html/body/div[3]/div/div/div[3]/div/div/div[1]/div/div[3]/h5",

      total_price: "/html/body/div[3]/div/div/div[3]/div/div/div[1]/div/div[10]/h5",
      //html/body/div[3]/div/div/div[3]/div/div/div[1]/div/div[9]/h5

      order_popup_close: "/html/body/div[3]/div/div/div[2]/button",

      feedback: "//*[@id='root']/div[4]/div[2]/div[1]/div/div/div/div/button[2]",

      type_dropdown: "/html/body/div[3]/div/div/div[3]/div/section/div/div/div[2]/div/div/div[5]/div",

      comments: "/html/body/div[4]/div[3]/ul/li[1]",
      suggestions: "/html/body/div[4]/div[3]/ul/li[2]",
      questions: "/html/body/div[4]/div[3]/ul/li[3]",


      category_dropdown: "/html/body/div[3]/div/div/div[3]/div/section/div/div/div[2]/div/div/div[6]/div",

      product_quality: "/html/body/div[4]/div[3]/ul/li[1]",
      accuracy: "/html/body/div[4]/div[3]/ul/li[2]",
      late_order: "/html/body/div[4]/div[3]/ul/li[3]",
      hospitality: "/html/body/div[4]/div[3]/ul/li[4]",


      feedback_text: "//*[@id='exampleFormControlTextarea1']",

      submit_button: "/html/body/div[3]/div/div/div[3]/div/section/div/button",

      feed_popup_close: "/html/body/div[3]/div/div/div[2]/button",

      feedback_popup: "/html/body/div/div[1]/div/div/div[1]/div[2]",




    },

    favorites_page: {

      add_to_favorities: "//*[@id='EverydayValue']/div/div[1]/div/div/div/div[1]/span/div/button",
      menu_first_item_heart: "//*[@id='EverydayValue']/div/div[1]/div/div/div/div[1]/span/div/button",
      menu_first_item_name: "//*[@id='EverydayValue']/div/div[1]/div/div/div/div[1]/h5",
      my_favorites: "/html/body/div[3]/div/div/div[3]/ul/ul/a[4]",
      first_item_name: "//*[@id='root']/div[4]/div[2]/div[1]/div/div/div[3]/div/h5",
      //*[@id="root"]/div[4]/div[2]/div[1]/div/div/div[3]/div/h5

      second_item_name: "//*[@id='root']/div[4]/div[2]/div[2]/div/div/div[3]/div/h5",
      //*[@id="root"]/div[4]/div[2]/div[2]/div/div/div[3]/div/h5
      remove_first_item: "//*[@id='root']/div[4]/div[2]/div/div/div/div[3]/div/button",
      remove_second_item: "//*[@id='root']/div[4]/div[2]/div[2]/div/div/div[3]/div/button",
      favorites_removed_popup: "/html/body/div/div[1]/div/div/div[1]/div[2]"

    },

    cart: {

          cart_header_link: "/html/body/div/div[2]/nav[2]/div/div[3]/a",
      cart_header_link_prod:"/html/body/div/div[2]/nav/div/div[3]/a",
                             
      increase_quantity: "//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div/button[2]",
      decrease_delete_item: "//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div/button[1]",
      quantity_value: "//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div/span",
      explore_menu_button: "//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[1]/div[2]/div/a",

      other_meals_name: "//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[3]/div/div[1]/div/h5",
      //*[@id="root"]/div[2]/div[3]/div/div/div[1]/div[3]/div/div[2]/div/h5
      //*[@id="root"]/div[2]/div[3]/div/div/div[1]/div[3]/div/div[3]/div/h5


      add_to_bucket: "//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[3]/div/div[1]/div/div/div/div/button[1]",
                      //*[@id="root"]/div[2]/div[3]/div/div/div[1]/div[3]/div/div[2]/div/div/div/div/button[1]
                      //*[@id="root"]/div[2]/div[3]/div/div/div[1]/div[3]/div/div[3]/div/div/div/div/button[1]

      voucher_input: "/html/body/div/div[2]/div[3]/div/div/div[2]/div[1]/div[2]/div/div/div/div/input",
      voucher_apply: "//*[@id='root']/div[2]/div[3]/div/div/div[2]/div[1]/div[2]/div/button",
      voucher_error: "/html/body/div/div[1]/div/div/div[1]/div[2]",

      voucher_success: "/html/body/div/div[1]/div/div/div[1]/div[2]",

      discount_amount:"//*[@id='root']/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[5]/h5",
                    
      total_bill_with_discount: "/html/body/div/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[6]/h5",

      special_instr_input: "//*[@id='exampleFormControlTextarea1']",
      
      alt_number: "//*[@id='outlined-number']",

      
      donation_amount_1: "//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[2]/div[2]/div/div[1]/div/div",
      donate_now_1: "//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[2]/div[2]/div/div[1]/button",

      donate_decrease: "//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/button[1]",
      donation_amount_2: "//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div",
      donate_increase: "//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/button[2]",
      
      donate_now_2: "//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[2]/div[2]/div/div[2]/button",
      enter_amount:"/html/body/div/div[2]/div[3]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div/input",
      donate_now_3: "//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[2]/div[2]/div/div[3]/button",

      your_order_donation: "/html/body/div/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[5]/div/h5",

      total_bill_with_donation: "/html/body/div/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[6]/h5",

      sub_total: "//*[@id='root']/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/h5",
      delivery_fee: "//*[@id='root']/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[3]/h5",
      pos: "//*[@id='root']/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[4]/h5",
      GST: "//*[@id='root']/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[4]/h5",

  
      total_bill_value: "/html/body/div/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[5]/h5",

           checkout_link: "/html/body/div/div[2]/div[3]/div/div/div[2]/div[2]/div[2]",

      checkout_link_prod: "/html/body/div/div[2]/div[3]/div/div/div[2]/div/div[2]/div",

      select_payment_mode: "/html/body/div/div[2]/div[3]/div/div/div[2]/div/button",

    },


    late_login: {

      phone_input: "/html/body/div/div[4]/div/div[1]/div/div/div/div[2]/div/div[1]/div/div/input",
      send_otp: "//*[@id='root']/div[4]/div/div[1]/div/div/div/div[2]/div/div[2]/button[1]"

    },


    payment_method: {

      select_payment_mode: "/html/body/div/div[2]/div[3]/div/div/div[2]/div/button",
      cash_payment: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div[1]/label",

      online_payment: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div[2]/label",

      online_payment_pickup: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div[1]/label",

      card_number: "//*[@id='card_number']",
      expiry_month: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/form/div/div/div/div/div[2]/div/div/input",
      expiry_year: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/form/div/div/div/div/div[3]/div/div/input",
      card_cvc: "//*[@id='card_cvn']",

      jazz_cash: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div[3]/label",

      jazz_cash_pickup: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div[2]/label",

      another_phone: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div[4]/div/div/div[1]/label/span[1]/input",

      another_phone_pickup: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div[3]/div/div/div[1]/label/span[1]/input",
      phone_input: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div[4]/div/div/div[2]/div/div/div/div/input",
      phone_input_pickup: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div[3]/div/div/div[2]/div/div/div/div/input",

      jazz_cash_popup: "/html/body/div[1]/div[1]/div/div/div[1]/div[2]",

      jazz_radio_button_prod:"/html/body/div[3]/div/div/div[3]/div[1]/div/div/div[2]/label/span[1]/input",

      card_on_delivery: "/html/body/div[3]/div/div/div[3]/div[1]/div/div/div[4]/label",

      are_you_sure_yes: "/html/body/div[5]/div/div/div[3]/div/button[2]",
      are_you_sure_cancel: "/html/body/div[5]/div/div/div[3]/div/button[1]",

      cancel_button: "/html/body/div[3]/div/div/div[3]/div[2]/button[1]",
      make_payment: "/html/body/div[3]/div/div/div[3]/div[2]/button[2]",
    
      payment_mode_window_close: "/html/body/div[3]/div/div/div[2]/button",

           success_message:"/html/body/div[3]/div/div/div[3]",
      
      jazz_success_message:"/html/body/div[5]/div/div/div[3]",
      
      success_message_pickup:"/html/body/div[5]/div/div/div[3]",

           ok_button: "/html/body/div[3]/div/div/div[3]/div/button",
      
      jazz_ok_button: "/html/body/div[5]/div/div/div[3]/div/button",
      
      ok_button_pickup: "/html/body/div[5]/div/div/div[3]/div/button",

      button: "/html/body/div[5]/div/div/div[3]/div/button[2]",

        tracking_id_text: "/html/body/div[3]/div/div/div[3]/text()[1]",
      
      tracking_no: "/html/body/div[3]/div/div/div[3]/text()[2]"
    },

    store_locator: {

      menu_icon: "//*[@id='root']/div[2]/div[1]/nav[2]/div/div[1]/button",
      store_locator_link: "/html/body/div[3]/div[2]/ul/ul[1]/a[1]",
      search_input: "//*[@id='root']/div[2]/div[3]/div/div/div[2]/div[1]/div/div[1]/div[1]/form/div/input",
      city_popup: "//*[@id='root']/div/div[3]/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div",
      city_dropdown_list: "/html/body/div[2]/div[3]/ul",
      all_tab: "//*[@id='uncontrolled-tab-example-tab-All']",
      delivery_tab: "//*[@id='uncontrolled-tab-example-tab-Delivery']",
      pickup_tab: "//*[@id='uncontrolled-tab-example-tab-Pickup']",
      first_result: "/html/body/div/div[2]/div[3]/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div[1]"
      ///html/body/div/div/div[3]/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div[4]
      ///html/body/div/div/div[3]/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div[2]
    },

    track_order: {

      phone: "/html/body/div/div[4]/div/div[2]/div[1]/div/div/div[1]/div/div/input",
      phone_error: "/html/body/div/div[4]/div/div[2]/div[1]/div/div/div[1]/div/p",
      order_id: "/html/body/div/div[4]/div/div[2]/div[1]/div/div/div[2]/div/div/input",
      track_button: "/html/body/div/div[4]/div/div[2]/div[1]/div/div/button",
      order_id_error: "/html/body/div/div[1]/div/div/div[1]/div[2]"

    },

    careers_page: {

      form_heading: "//*[@id='root']/div[4]/div[3]/h2",

    },


    footer: {

      home_page: "//*[@id='root']/div[2]/div[1]/nav[2]/div/div[1]/div[1]/a",
      footer: "//*[@id='root']/div[2]/div[10]",
      youtube_link: "//*[@id='root']/div[2]/div[10]/div/div[1]/div[2]/div/a[1]",
      instagram_link: "//*[@id='root']/div[2]/div[10]/div/div[1]/div[2]/div/a[2]",
      facebook_link: "//*[@id='root']/div[2]/div[10]/div/div[1]/div[2]/div/a[3]",
      app_store: "//*[@id='root']/div[2]/div[10]/div/div[2]/div[4]/div/a[1]",
      google_play: "//*[@id='root']/div[2]/div[10]/div/div[2]/div[4]/div/a[2]",
      about_us: "//*[@id='root']/div[2]/div[10]/div/div[2]/div[1]/ul/a[1]",
      Mitao_bhook: "//*[@id='root']/div[2]/div[10]/div/div[2]/div[1]/ul/a[2]",
      scholarship: "",
      privacy_policy: "//*[@id='root']/div[2]/div[10]/div/div[2]/div[1]/ul/a[4]",
      careers: "//*[@id='root']/div[2]/div[10]/div/div[2]/div[1]/ul/a[5]",
      contact_us: "//*[@id='root']/div[2]/div[10]/div/div[2]/div[2]/ul/a[1]",
      store_locator: "//*[@id='root']/div[2]/div[10]/div/div[2]/div[2]/ul/a[2]",
      track_order: "//*[@id='root']/div[2]/div[10]/div/div[2]/div[2]/ul/a[3]",
      terms: "//*[@id='root']/div[2]/div[10]/div/div[2]/div[3]/ul/a",
      feed_back: "",

    },

    career_page: {

      full_name: "/html/body/div/div[4]/div[3]/div[1]/div/div/div/div[1]/div/div/input",
      date_birth: "/html/body/div/div[4]/div[3]/div[1]/div/div/div/div[2]/div/div/input",
      country_birth: "/html/body/div/div[4]/div[3]/div[1]/div/div/div/div[3]/div/div/input",
      city_birth: "/html/body/div/div[4]/div[3]/div[1]/div/div/div/div[4]/div/div/input",
      cnic: "/html/body/div/div[4]/div[3]/div[1]/div/div/div/div[5]/div/div/input",
      cnic_expiry: "/html/body/div/div[4]/div[3]/div[1]/div/div/div/div[6]/div/div/input",

      martial_status_dropdown: "//*[@id='root']/div[4]/div[3]/div[1]/div/div/div/div[7]/div",

      martial_status: "/html/body/div[2]/div[3]/ul/li[1]",

      gender_dropdown: "//*[@id='root']/div[4]/div[3]/div[1]/div/div/div/div[8]/div",

      male_value: "/html/body/div[2]/div[3]/ul/li[1]",

      religion: "/html/body/div/div[4]/div[3]/div[1]/div/div/div/div[9]/div/div/input",
      disability: "/html/body/div/div[4]/div[3]/div[1]/div/div/div/div[10]/div/div/input",
      address_no: "/html/body/div/div[4]/div[3]/div[2]/div/div/div/div[1]/div/div/input",
      address: "/html/body/div/div[4]/div[3]/div[2]/div/div/div/div[2]/div/div/input",
      country: "/html/body/div/div[4]/div[3]/div[2]/div/div/div/div[3]/div/div/input",
      state: "/html/body/div/div[4]/div[3]/div[2]/div/div/div/div[4]/div/div/input",
      city: "/html/body/div/div[4]/div[3]/div[2]/div/div/div/div[5]/div/div/input",
      referred: "/html/body/div/div[4]/div[3]/div[3]/div/div/div/div[1]/div/div/input",
      city_apply: "/html/body/div/div[4]/div[3]/div[3]/div/div/div/div[2]/div/div/input",
      position: "/html/body/div/div[4]/div[3]/div[3]/div/div/div/div[3]/div/div/input",
      shift_type: "/html/body/div/div[4]/div[3]/div[3]/div/div/div/div[4]/div/div/input",
      type_emp: "/html/body/div/div[4]/div[3]/div[3]/div/div/div/div[5]/div/div/input",
      degree: "/html/body/div/div[4]/div[3]/div[4]/div/div/div/div[1]/div/div/input",
      major: "/html/body/div/div[4]/div[3]/div[4]/div/div/div/div[2]/div/div/input",
      year: "/html/body/div/div[4]/div[3]/div[4]/div/div/div/div[3]/div/div/input",
      place: "/html/body/div/div[4]/div[3]/div[4]/div/div/div/div[4]/div/div/input",
      exp_years: "/html/body/div/div[4]/div[3]/div[5]/div/div/div/div[1]/div/div/input",
      recent_position: "/html/body/div/div[4]/div[3]/div[5]/div/div/div/div[2]/div/div/input",
      recent_company: "/html/body/div/div[4]/div[3]/div[5]/div/div/div/div[3]/div/div/input",
      agreement: "/html/body/div/div[4]/div[3]/div[6]/div/div/div[2]/label/span[1]/input",
      apply: "/html/body/div/div[4]/div[3]/div[6]/div/div/button",
      success_popup:"/html/body/div/div[1]/div/div/div[1]/div[2]"

    }

  }

}

