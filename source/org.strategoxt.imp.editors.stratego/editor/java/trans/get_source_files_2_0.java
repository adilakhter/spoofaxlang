package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_source_files_2_0 extends Strategy 
{ 
  public static get_source_files_2_0 instance = new get_source_files_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4181, Strategy g_4181)
  { 
    context.push("get_source_files_2_0");
    Fail21341:
    { 
      TermReference i_4180 = new TermReference();
      IStrategoTerm j_4180 = null;
      if(i_4180.value == null)
        i_4180.value = term;
      else
        if(i_4180.value != term && !i_4180.value.match(term))
          break Fail21341;
      Success11453:
      { 
        Fail21342:
        { 
          IStrategoTerm k_4180 = null;
          IStrategoTerm l_4180 = null;
          k_4180 = term;
          if(i_4180.value == null)
            break Fail21342;
          term = i_4180.value;
          l_4180 = i_4180.value;
          term = g_4181.invoke(context, term);
          if(term == null)
            break Fail21342;
          term = isdir_0_0.instance.invoke(context, l_4180);
          if(term == null)
            break Fail21342;
          term = k_4180;
          { 
            if(i_4180.value == null)
              break Fail21341;
            term = readdir_0_0.instance.invoke(context, i_4180.value);
            if(term == null)
              break Fail21341;
            lifted6498 lifted64980 = new lifted6498();
            lifted64980.i_4180 = i_4180;
            term = map_1_0.instance.invoke(context, term, lifted64980);
            if(term == null)
              break Fail21341;
            lifted6499 lifted64990 = new lifted6499();
            lifted64990.f_4181 = f_4181;
            lifted64990.g_4181 = g_4181;
            term = map_1_0.instance.invoke(context, term, lifted64990);
            if(term == null)
              break Fail21341;
            term = flatten_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21341;
            j_4180 = term;
            if(true)
              break Success11453;
          }
        }
        term = trans.constNil3;
        j_4180 = trans.constNil3;
      }
      term = j_4180;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}