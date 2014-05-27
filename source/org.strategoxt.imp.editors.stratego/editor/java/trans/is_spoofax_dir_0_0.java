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

@SuppressWarnings("all") public class is_spoofax_dir_0_0 extends Strategy 
{ 
  public static is_spoofax_dir_0_0 instance = new is_spoofax_dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_spoofax_dir_0_0");
    Fail21346:
    { 
      TermReference w_4181 = new TermReference();
      IStrategoTerm x_4181 = null;
      if(w_4181.value == null)
        w_4181.value = term;
      else
        if(w_4181.value != term && !w_4181.value.match(term))
          break Fail21346;
      x_4181 = term;
      term = spoofax_dirs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21346;
      lifted6501 lifted65010 = new lifted6501();
      lifted65010.w_4181 = w_4181;
      term = fetch_1_0.instance.invoke(context, term, lifted65010);
      if(term == null)
        break Fail21346;
      term = x_4181;
      if(w_4181.value == null)
        break Fail21346;
      term = w_4181.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}