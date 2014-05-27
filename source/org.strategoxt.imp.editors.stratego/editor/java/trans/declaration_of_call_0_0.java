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

@SuppressWarnings("all") public class declaration_of_call_0_0 extends Strategy 
{ 
  public static declaration_of_call_0_0 instance = new declaration_of_call_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("declaration_of_call_0_0");
    Fail22779:
    { 
      IStrategoTerm a_4725 = null;
      TermReference b_4725 = new TermReference();
      TermReference c_4725 = new TermReference();
      TermReference d_4725 = new TermReference();
      IStrategoTerm e_4725 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22779;
      IStrategoTerm arg8048 = term.getSubterm(0);
      if(arg8048.getTermType() != IStrategoTerm.APPL || Main._consCallT_3 != ((IStrategoAppl)arg8048).getConstructor())
        break Fail22779;
      IStrategoTerm arg8049 = arg8048.getSubterm(0);
      if(arg8049.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg8049).getConstructor())
        break Fail22779;
      IStrategoTerm arg8050 = arg8049.getSubterm(0);
      if(b_4725.value == null)
        b_4725.value = arg8050;
      else
        if(b_4725.value != arg8050 && !b_4725.value.match(arg8050))
          break Fail22779;
      IStrategoList annos691 = arg8050.getAnnotations();
      if(annos691.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos691).isEmpty())
        break Fail22779;
      if(c_4725.value == null)
        c_4725.value = ((IStrategoList)annos691).head();
      else
        if(c_4725.value != ((IStrategoList)annos691).head() && !c_4725.value.match(((IStrategoList)annos691).head()))
          break Fail22779;
      IStrategoTerm arg8051 = ((IStrategoList)annos691).tail();
      if(arg8051.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8051).isEmpty())
        break Fail22779;
      a_4725 = term.getSubterm(1);
      e_4725 = term;
      term = a_4725;
      lifted6723 lifted67230 = new lifted6723();
      lifted67230.b_4725 = b_4725;
      lifted67230.c_4725 = c_4725;
      lifted67230.d_4725 = d_4725;
      term = oncetd_1_0.instance.invoke(context, term, lifted67230);
      if(term == null)
        break Fail22779;
      term = e_4725;
      if(d_4725.value == null)
        break Fail22779;
      term = d_4725.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}