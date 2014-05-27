package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class context_free_syntax_sort_error_0_0 extends Strategy 
{ 
  public static context_free_syntax_sort_error_0_0 instance = new context_free_syntax_sort_error_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_syntax_sort_error_0_0");
    Fail75912:
    { 
      IStrategoTerm term41707 = term;
      IStrategoConstructor cons1786 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41631:
      { 
        if(cons1786 == Main._consrenamed_module_2)
        { 
          Fail75913:
          { 
            IStrategoTerm arg25997 = term.getSubterm(1);
            if(arg25997.getTermType() != IStrategoTerm.APPL || Main._consrenamings_1 != ((IStrategoAppl)arg25997).getConstructor())
              break Fail75913;
            term = trans.constNil11;
            if(true)
              break Success41631;
          }
          term = term41707;
        }
        Success41632:
        { 
          if(cons1786 == Main._conssort_1)
          { 
            Fail75914:
            { 
              IStrategoTerm w_92056 = null;
              IStrategoTerm b_92057 = null;
              IStrategoTerm d_92057 = null;
              IStrategoTerm e_92057 = null;
              w_92056 = term.getSubterm(0);
              IStrategoTerm term41709 = term;
              Success41633:
              { 
                Fail75915:
                { 
                  term = $Declaration_0_0.instance.invoke(context, w_92056);
                  if(term == null)
                    break Fail75915;
                  { 
                    if(true)
                      break Fail75914;
                    if(true)
                      break Success41633;
                  }
                }
                term = term41709;
              }
              term = w_92056;
              IStrategoTerm term41710 = term;
              Success41634:
              { 
                Fail75916:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75916;
                  if(true)
                    break Success41634;
                }
                term = term41710;
                IStrategoTerm term41711 = term;
                Success41635:
                { 
                  Fail75917:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75917;
                    if(true)
                      break Success41635;
                  }
                  term = term41711;
                  IStrategoTerm term41712 = term;
                  Success41636:
                  { 
                    Fail75918:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75918;
                      if(true)
                        break Success41636;
                    }
                    term = term41712;
                    IStrategoTerm term41713 = term;
                    Success41637:
                    { 
                      Fail75919:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75919;
                        if(true)
                          break Success41637;
                      }
                      term = term41713;
                      IStrategoTerm x_92056 = null;
                      IStrategoTerm y_92056 = null;
                      IStrategoTerm a_92057 = null;
                      x_92056 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail75914;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail75914;
                      y_92056 = ((IStrategoList)term).tail();
                      a_92057 = y_92056;
                      term = report_failure_0_2.instance.invoke(context, a_92057, trans.const15546, x_92056);
                      if(term == null)
                        break Fail75914;
                    }
                  }
                }
              }
              d_92057 = term;
              b_92057 = trans.const15453;
              e_92057 = d_92057;
              term = string_replace_0_2.instance.invoke(context, e_92057, b_92057, trans.const15547);
              if(term == null)
                break Fail75914;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const15548, termFactory.makeListCons(term, (IStrategoList)trans.constNil11));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75914;
              term = termFactory.makeTuple(w_92056, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
              if(true)
                break Success41632;
            }
            term = term41707;
          }
          Success41638:
          { 
            if(cons1786 == Main._consparameterized_sort_2)
            { 
              Fail75920:
              { 
                term = trans.constNil11;
                if(true)
                  break Success41638;
              }
              term = term41707;
            }
            if(cons1786 == Main._conssorts_1)
            { 
              term = trans.constNil11;
            }
            else
            { 
              break Fail75912;
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}