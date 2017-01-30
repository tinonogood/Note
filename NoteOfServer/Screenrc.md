 修改 screenrc  vi ~/.screenrc
 
  #Modified date: 2011/1/8
  
  
  # Display the  copyright  notice  during  startup
  startup_message off
  
  # Set scrollback line
  defscrollback 1024
  
  # Set default encoding using utf8
  defutf8 on
  
  # Set split status always on
  caption splitonly "%{= bK} %{= bG} [%n] %t @ %H"
  
  # Set hardstatus always on
  hardstatus alwayslastline "%{= WK} %-Lw%{= KY}%n%f %t%{-}%+Lw %{= WM} %=| %0c:%s  %Y-%m-%d"
  
  # Define bindkey
  # window function
  bindkey ^[s split      # split screen to two region
  bindkey ^[o only       # detach all regrion but keep current region
  bindkey ^[t focus      # switch input focus region
  
  bindkey ^[[ copy       # copy region to buffer
  bindkey ^[] paste .    # paste region from buffter
  
  bindkey ^[r remove     # remove region
  bindkey ^[k focus up   # previous region
  bindkey ^[j focus down # next region
  bindkey ^[= resize +1  # increase region size
  bindkey ^[- resize -1  # decrease region size
  
  bindkey ^[c screen     # create screen
  bindkey ^[a title      # setup screen title
  bindkey ^[l next       # next screen
  bindkey ^[h prev       # previous screen
  
  bindkey ^[* displays   # list all attach session
  bindkey ^[d detach     # detach session
  bindkey ^[q quit       # quit session
  
  caption always "%{= wk} %{= KY} [%n]%t @ %H %{-} %= %{= KR} %l %{-} | %{= KG} %Y-%m-%d %{-} "
  hardstatus alwayslastline " %-Lw%{= Bw}%n%f %t%{-}%+Lw %=| %0c:%s "
  shell -$SHELL

