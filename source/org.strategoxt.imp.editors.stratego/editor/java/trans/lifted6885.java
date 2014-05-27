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

@SuppressWarnings("all") final class lifted6885 extends Strategy 
{ 
  TermReference b_4801;

  TermReference c_4801;

  TermReference d_4801;

  TermReference e_4801;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24020:
    { 
      if(b_4801.value == null)
        break Fail24020;
      term = map_1_0.instance.invoke(context, b_4801.value, declare_let_definition_0_0.instance);
      if(term == null)
        break Fail24020;
      if(c_4801.value == null)
        c_4801.value = term;
      else
        if(c_4801.value != term && !c_4801.value.match(term))
          break Fail24020;
      if(d_4801.value == null)
        break Fail24020;
      term = declare_bodies_top_0_0.instance.invoke(context, d_4801.value);
      if(term == null)
        break Fail24020;
      if(e_4801.value == null)
        e_4801.value = term;
      else
        if(e_4801.value != term && !e_4801.value.match(term))
          break Fail24020;
      if(true)
        return term;
    }
    return null;
  }
}