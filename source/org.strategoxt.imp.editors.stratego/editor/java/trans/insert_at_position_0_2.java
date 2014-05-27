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

@SuppressWarnings("all") public class insert_at_position_0_2 extends Strategy 
{ 
  public static insert_at_position_0_2 instance = new insert_at_position_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_4721, IStrategoTerm ref_f_4721)
  { 
    TermReference f_4721 = new TermReference(ref_f_4721);
    context.push("insert_at_position_0_2");
    Fail22749:
    { 
      TermReference g_4721 = new TermReference();
      IStrategoTerm h_4721 = null;
      IStrategoTerm i_4721 = null;
      i_4721 = term;
      term = init_0_0.instance.invoke(context, e_4721);
      if(term == null)
        break Fail22749;
      h_4721 = term;
      term = last_0_0.instance.invoke(context, e_4721);
      if(term == null)
        break Fail22749;
      if(g_4721.value == null)
        g_4721.value = term;
      else
        if(g_4721.value != term && !g_4721.value.match(term))
          break Fail22749;
      term = i_4721;
      lifted6721 lifted67210 = new lifted6721();
      lifted67210.g_4721 = g_4721;
      lifted67210.f_4721 = f_4721;
      term = at_position_1_1.instance.invoke(context, term, lifted67210, h_4721);
      if(term == null)
        break Fail22749;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}