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

@SuppressWarnings("all") public class inline_0_0 extends Strategy 
{ 
  public static inline_0_0 instance = new inline_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("inline_0_0");
    Fail22784:
    { 
      TermReference a_4726 = new TermReference();
      IStrategoTerm b_4726 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22784;
      IStrategoTerm arg8088 = term.getSubterm(0);
      if(a_4726.value == null)
        a_4726.value = arg8088;
      else
        if(a_4726.value != arg8088 && !a_4726.value.match(arg8088))
          break Fail22784;
      if(arg8088.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)arg8088).getConstructor())
        break Fail22784;
      IStrategoTerm arg8089 = arg8088.getSubterm(0);
      IStrategoList annos698 = arg8089.getAnnotations();
      if(annos698.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos698).isEmpty())
        break Fail22784;
      IStrategoTerm arg8090 = ((IStrategoList)annos698).tail();
      if(arg8090.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8090).isEmpty())
        break Fail22784;
      b_4726 = term.getSubterm(1);
      term = b_4726;
      lifted6727 lifted67270 = new lifted6727();
      lifted67270.a_4726 = a_4726;
      term = topdown_1_0.instance.invoke(context, term, lifted67270);
      if(term == null)
        break Fail22784;
      lifted6729 lifted67290 = new lifted6729();
      lifted67290.a_4726 = a_4726;
      term = delete_elements_1_0.instance.invoke(context, term, lifted67290);
      if(term == null)
        break Fail22784;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}