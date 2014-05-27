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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_4344)
  { 
    context.push("check_extension_0_1");
    Fail21343:
    { 
      IStrategoTerm term11478 = term;
      Success11454:
      { 
        Fail21344:
        { 
          term = has_extension_0_1.instance.invoke(context, term, z_4344);
          if(term == null)
            break Fail21344;
          if(true)
            break Success11454;
        }
        term = term11478;
        IStrategoTerm p_4181 = null;
        TermReference q_4181 = new TermReference();
        p_4181 = term;
        term = get_extension_0_0.instance.invoke(context, p_4181);
        if(term == null)
          break Fail21343;
        if(q_4181.value == null)
          q_4181.value = term;
        else
          if(q_4181.value != term && !q_4181.value.match(term))
            break Fail21343;
        term = z_4344;
        lifted6500 lifted65000 = new lifted6500();
        lifted65000.q_4181 = q_4181;
        term = fetch_1_0.instance.invoke(context, term, lifted65000);
        if(term == null)
          break Fail21343;
        term = p_4181;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}