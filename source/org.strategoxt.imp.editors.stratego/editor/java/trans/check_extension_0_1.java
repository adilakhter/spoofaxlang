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

@SuppressWarnings("all") public class check_extension_0_1 extends Strategy 
{ 
  public static check_extension_0_1 instance = new check_extension_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_4898)
  { 
    context.push("check_extension_0_1");
    Fail22819:
    { 
      IStrategoTerm term12187 = term;
      Success12163:
      { 
        Fail22820:
        { 
          term = has_extension_0_1.instance.invoke(context, term, r_4898);
          if(term == null)
            break Fail22820;
          if(true)
            break Success12163;
        }
        term = term12187;
        IStrategoTerm h_4735 = null;
        TermReference i_4735 = new TermReference();
        h_4735 = term;
        term = get_extension_0_0.instance.invoke(context, h_4735);
        if(term == null)
          break Fail22819;
        if(i_4735.value == null)
          i_4735.value = term;
        else
          if(i_4735.value != term && !i_4735.value.match(term))
            break Fail22819;
        term = r_4898;
        lifted6771 lifted67710 = new lifted6771();
        lifted67710.i_4735 = i_4735;
        term = fetch_1_0.instance.invoke(context, term, lifted67710);
        if(term == null)
          break Fail22819;
        term = h_4735;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}