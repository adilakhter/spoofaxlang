package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bagof_get_config_reference_0_0 extends Strategy 
{ 
  public static bagof_get_config_reference_0_0 instance = new bagof_get_config_reference_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_get_config_reference_0_0");
    Fail22972:
    { 
      TermReference d_4637 = new TermReference();
      TermReference e_4637 = new TermReference();
      if(e_4637.value == null)
        e_4637.value = term;
      else
        if(e_4637.value != term && !e_4637.value.match(term))
          break Fail22972;
      if(d_4637.value == null)
        d_4637.value = term;
      else
        if(d_4637.value != term && !d_4637.value.match(term))
          break Fail22972;
      Success12216:
      { 
        Fail22973:
        { 
          IStrategoTerm h_4637 = null;
          IStrategoTerm j_4637 = null;
          IStrategoTerm k_4637 = null;
          j_4637 = term;
          h_4637 = trans.const4482;
          k_4637 = j_4637;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4637, h_4637, trans.constCons2047);
          if(term == null)
            break Fail22973;
          if(true)
            break Success12216;
        }
        term = trans.constNil4;
      }
      lifted6892 lifted68920 = new lifted6892();
      lifted68920.d_4637 = d_4637;
      lifted68920.e_4637 = e_4637;
      term = filter_1_0.instance.invoke(context, term, lifted68920);
      if(term == null)
        break Fail22972;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}