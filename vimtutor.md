# VI/VIM
---

## vim adventure

search: (http://vim-adventures.com/)

---
## vimtutor

\#vimtutor :開始vimtutor

### lesson 1

	1.1
		HJKL: left down up right (J: likes downward)
	1.2
		':q!<enter>': quit & force (w/o saving)
	1.3
		x : delete
	1.4
		i : change to insert mode,  <ESC>: leave
	1.5
		A : append text, 至游標所在行，最後開始"insert mode"
	1.6
		':wq': write(save) & quit

### lesson 2
	
	2.1 
		dw : delete string, w/ space  >> he'l'lo worlds==>heworlds
	2.2
		de : delete string, w/o space >> he'l'lo worlds==>he worlds
	2.3
		d$ : delete line              >> he'l'lo worlds==>he
	2.4
		w : move cursor to next word's begin
		e : move cursor to word's end
		{number}w : move cursor to next {number} words' begin
		{number}e : move cursor to {number} words' end
		0: to the start of line
	2.5
		d{number}{motion}
		d5e : delete 5 words w/o space
	2.6
		{number}dd : clean {number} lines
	2.7
		u : undo
		Ctrl+R : redo
		U : fix line
		
		
### lesson 3

	3.1
		dd : cut the line
		p : put after the cursor
	3.2
		r : replace a word
	3.3
		c : change, =insert+delete
		ce : change till end of the word
		c$ : change till end of the line
	3.4
		c{number}{motion}
		c4w : change 4 words
		
### lesson 4
	4.1
		Ctrl+g : show line#
		G : go to end of file
		gg : go to top of file
		{number}G : go to {number} line 
	4.2
		/ : search
		n : next
		N : previous
		? : search in backward direc.
		Ctrl+o : 返回先前位置(origin), go back
		Ctrl+i : go forward
	4.3
		% : find match '()','[]','{}'前後括弧對應
	4.4
		:s/old/new : substitute new word
		:s/old/new/g : whole line
		:#,#s/old/new/g : line #
		:%s/old/new/g :　whole file
		:%s/old/new/gc : w/ consult 

### lesson 5
	5.1
		:!{command} : execute external command
	5.2
		:w {filename} : save as {filename} 
	5.3
		v : highlight
		:'<,'>w {filename}　: save highlighted as {filename}
	5.4
		:r {filename} : retrieving {filename} & paste below cursor

### lesson 6

	6.1
		o : insert mode below cursor
		O : 			above cursor
	6.2
		a : insert mode behind cursor
		A :				end of the line
	6.3	
		R : replace mode (一直改) ;<ESC>: leave
	6.4
		y : yank, 猛拉(複製)
		p : paste
	6.5
		:set {option} :設置
			
			{option}
            --------------------------
			ic : ignore case(忽略大小寫)
			hls : highlight search
			is : incsearch, 立即反應移動至目前鍵入之字串
		也可至.vimrc修改設定檔

### lesson 7
	
	7.1
		F1 & :help : go to online help system
	7.2
		:r $VIMRUNTIME/vimrc_example.vim
		look example "vimrc" file
		