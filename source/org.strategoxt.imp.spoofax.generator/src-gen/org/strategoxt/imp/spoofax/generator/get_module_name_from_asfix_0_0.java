package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_module_name_from_asfix_0_0 extends Strategy 
{ 
  public static get_module_name_from_asfix_0_0 instance = new get_module_name_from_asfix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_module_name_from_asfix_0_0");
    Fail25488:
    { 
      IStrategoTerm b_4225 = null;
      IStrategoTerm c_4225 = null;
      IStrategoTerm d_4225 = null;
      term = collect_om_1_0.instance.invoke(context, term, lifted9033.instance);
      if(term == null)
        break Fail25488;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail25488;
      b_4225 = ((IStrategoList)term).head();
      IStrategoTerm arg5868 = ((IStrategoList)term).tail();
      if(arg5868.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5868).isEmpty())
        break Fail25488;
      term = b_4225;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail25488;
      IStrategoTerm arg5870 = term.getSubterm(1);
      if(arg5870.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5870).isEmpty())
        break Fail25488;
      IStrategoTerm arg5872 = ((IStrategoList)arg5870).tail();
      if(arg5872.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5872).isEmpty())
        break Fail25488;
      IStrategoTerm arg5874 = ((IStrategoList)arg5872).tail();
      if(arg5874.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5874).isEmpty())
        break Fail25488;
      c_4225 = ((IStrategoList)arg5874).head();
      term = collect_om_1_0.instance.invoke(context, c_4225, lifted9034.instance);
      if(term == null)
        break Fail25488;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail25488;
      d_4225 = ((IStrategoList)term).head();
      IStrategoTerm arg5883 = ((IStrategoList)term).tail();
      if(arg5883.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5883).isEmpty())
        break Fail25488;
      term = asfix_lex_yield_0_0.instance.invoke(context, d_4225);
      if(term == null)
        break Fail25488;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}