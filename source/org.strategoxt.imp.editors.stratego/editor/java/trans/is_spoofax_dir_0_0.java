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
    Fail22822:
    { 
      TermReference o_4735 = new TermReference();
      IStrategoTerm p_4735 = null;
      if(o_4735.value == null)
        o_4735.value = term;
      else
        if(o_4735.value != term && !o_4735.value.match(term))
          break Fail22822;
      p_4735 = term;
      term = spoofax_dirs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22822;
      lifted6772 lifted67720 = new lifted6772();
      lifted67720.o_4735 = o_4735;
      term = fetch_1_0.instance.invoke(context, term, lifted67720);
      if(term == null)
        break Fail22822;
      term = p_4735;
      if(o_4735.value == null)
        break Fail22822;
      term = o_4735.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}